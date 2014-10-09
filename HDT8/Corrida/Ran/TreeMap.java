
/**
 * http://www.docjar.com/html/api/java/util/TreeMap.java.html
 * @author Javier Bucaro
 */
public class TreeMap<K,V>
         extends AbstractMap<K,V>
         implements NavigableMap<K,V>, Cloneable, java.io.Serializable, WordSet
     {
         /**
          * The comparator used to maintain order in this tree map, or
          * null if it uses the natural ordering of its keys.
          *
          * @serial
          */
         private final Comparator<? super K> comparator;
     
         private transient Entry<K,V> root = null;
     
         /**
          * The number of entries in the tree
          */
         private transient int size = 0;
     
         /**
          * The number of structural modifications to the tree.
          */
         private transient int modCount = 0;
     
         /**
          * Constructs a new, empty tree map, using the natural ordering of its
          * keys.  All keys inserted into the map must implement the {@link
          * Comparable} interface.  Furthermore, all such keys must be
          * <em>mutually comparable</em>: {@code k1.compareTo(k2)} must not throw
          * a {@code ClassCastException} for any keys {@code k1} and
          * {@code k2} in the map.  If the user attempts to put a key into the
          * map that violates this constraint (for example, the user attempts to
          * put a string key into a map whose keys are integers), the
          * {@code put(Object key, Object value)} call will throw a
          * {@code ClassCastException}.
          */
         public TreeMap() {
             comparator = null;
         }
     
         /**
          * Constructs a new, empty tree map, ordered according to the given
          * comparator.  All keys inserted into the map must be <em>mutually
          * comparable</em> by the given comparator: {@code comparator.compare(k1,
          * k2)} must not throw a {@code ClassCastException} for any keys
          * {@code k1} and {@code k2} in the map.  If the user attempts to put
          * a key into the map that violates this constraint, the {@code put(Object
          * key, Object value)} call will throw a
          * {@code ClassCastException}.
          *
          * @param comparator the comparator that will be used to order this map.
          *        If {@code null}, the {@linkplain Comparable natural
          *        ordering} of the keys will be used.
          */
         public TreeMap(Comparator<? super K> comparator) {
             this.comparator = comparator;
         }
     
         /**
          * Constructs a new tree map containing the same mappings as the given
          * map, ordered according to the <em>natural ordering</em> of its keys.
          * All keys inserted into the new map must implement the {@link
          * Comparable} interface.  Furthermore, all such keys must be
          * <em>mutually comparable</em>: {@code k1.compareTo(k2)} must not throw
          * a {@code ClassCastException} for any keys {@code k1} and
          * {@code k2} in the map.  This method runs in n*log(n) time.
          *
          * @param  m the map whose mappings are to be placed in this map
          * @throws ClassCastException if the keys in m are not {@link Comparable},
          *         or are not mutually comparable
          * @throws NullPointerException if the specified map is null
         */
         public TreeMap(Map<? extends K, ? extends V> m) {
             comparator = null;
             putAll(m);
         }
     
         /**
          * Constructs a new tree map containing the same mappings and
          * using the same ordering as the specified sorted map.  This
          * method runs in linear time.
          *
          * @param  m the sorted map whose mappings are to be placed in this map,
          *         and whose comparator is to be used to sort this map
          * @throws NullPointerException if the specified map is null
          */
         public TreeMap(SortedMap<K, ? extends V> m) {
             comparator = m.comparator();
             try {
                 buildFromSorted(m.size(), m.entrySet().iterator(), null, null);
             } catch (java.io.IOException cannotHappen) {
             } catch (ClassNotFoundException cannotHappen) {
             }
         }
     
     
         // Query Operations
     
         /**
          * Returns the number of key-value mappings in this map.
          *
          * @return the number of key-value mappings in this map
          */
         public int size() {
             return size;
         }
     
         /**
          * Returns {@code true} if this map contains a mapping for the specified
          * key.
          *
          * @param key key whose presence in this map is to be tested
          * @return {@code true} if this map contains a mapping for the
          *         specified key
          * @throws ClassCastException if the specified key cannot be compared
          *         with the keys currently in the map
          * @throws NullPointerException if the specified key is null
          *         and this map uses natural ordering, or its comparator
         *         does not permit null keys
          */
         public boolean containsKey(Object key) {
             return getEntry(key) != null;
         }
    
         /**
          * Returns {@code true} if this map maps one or more keys to the
          * specified value.  More formally, returns {@code true} if and only if
          * this map contains at least one mapping to a value {@code v} such
          * that {@code (value==null ? v==null : value.equals(v))}.  This
          * operation will probably require time linear in the map size for
          * most implementations.
          *
          * @param value value whose presence in this map is to be tested
          * @return {@code true} if a mapping to {@code value} exists;
         *         {@code false} otherwise
          * @since 1.2
          */
         public boolean containsValue(Object value) {
             for (Entry<K,V> e = getFirstEntry(); e != null; e = successor(e))
                 if (valEquals(value, e.value))
                     return true;
             return false;
         }
     
         /**
          * Returns the value to which the specified key is mapped,
         * or {@code null} if this map contains no mapping for the key.
          *
          * <p>More formally, if this map contains a mapping from a key
          * {@code k} to a value {@code v} such that {@code key} compares
          * equal to {@code k} according to the map's ordering, then this
          * method returns {@code v}; otherwise it returns {@code null}.
          * (There can be at most one such mapping.)
          *
          * <p>A return value of {@code null} does not <em>necessarily</em>
          * indicate that the map contains no mapping for the key; it's also
          * possible that the map explicitly maps the key to {@code null}.
          * The {@link #containsKey containsKey} operation may be used to
          * distinguish these two cases.
          *
         * @throws ClassCastException if the specified key cannot be compared
          *         with the keys currently in the map
          * @throws NullPointerException if the specified key is null
          *         and this map uses natural ordering, or its comparator
          *         does not permit null keys
          */
         public V get(Object key) {
             Entry<K,V> p = getEntry(key);
             return (p==null ? null : p.value);
         }
     
         public Comparator<? super K> comparator() {
             return comparator;
         }
     
         /**
          * @throws NoSuchElementException {@inheritDoc}
          */
         public K firstKey() {
             return key(getFirstEntry());
         }
     
         /**
          * @throws NoSuchElementException {@inheritDoc}
          */
         public K lastKey() {
             return key(getLastEntry());
         }
     
         /**
          * Copies all of the mappings from the specified map to this map.
          * These mappings replace any mappings that this map had for any
          * of the keys currently in the specified map.
          *
          * @param  map mappings to be stored in this map
          * @throws ClassCastException if the class of a key or value in
          *         the specified map prevents it from being stored in this map
          * @throws NullPointerException if the specified map is null or
          *         the specified map contains a null key and this map does not
          *         permit null keys
          */
         public void putAll(Map<? extends K, ? extends V> map) {
             int mapSize = map.size();
             if (size==0 && mapSize!=0 && map instanceof SortedMap) {
                 Comparator c = ((SortedMap)map).comparator();
                 if (c == comparator || (c != null && c.equals(comparator))) {
                     ++modCount;
                     try {
                         buildFromSorted(mapSize, map.entrySet().iterator(),
                                         null, null);
                     } catch (java.io.IOException cannotHappen) {
                     } catch (ClassNotFoundException cannotHappen) {
                     }
                    return;
                 }
             }
             super.putAll(map);
         }
     
         /**
          * Returns this map's entry for the given key, or {@code null} if the map
          * does not contain an entry for the key.
          *
          * @return this map's entry for the given key, or {@code null} if the map
          *         does not contain an entry for the key
          * @throws ClassCastException if the specified key cannot be compared
          *         with the keys currently in the map
          * @throws NullPointerException if the specified key is null
          *         and this map uses natural ordering, or its comparator
          *         does not permit null keys
          */
         final Entry<K,V> getEntry(Object key) {
             // Offload comparator-based version for sake of performance
             if (comparator != null)
                 return getEntryUsingComparator(key);
             if (key == null)
                 throw new NullPointerException();
             Comparable<? super K> k = (Comparable<? super K>) key;
             Entry<K,V> p = root;
             while (p != null) {
                 int cmp = k.compareTo(p.key);
                 if (cmp < 0)
                     p = p.left;
                 else if (cmp > 0)
                     p = p.right;
                 else
                     return p;
             }
             return null;
         }
     
         /**
          * Version of getEntry using comparator. Split off from getEntry
          * for performance. (This is not worth doing for most methods,
          * that are less dependent on comparator performance, but is
          * worthwhile here.)
          */
         final Entry<K,V> getEntryUsingComparator(Object key) {
             K k = (K) key;
             Comparator<? super K> cpr = comparator;
             if (cpr != null) {
                 Entry<K,V> p = root;
                 while (p != null) {
                     int cmp = cpr.compare(k, p.key);
                     if (cmp < 0)
                         p = p.left;
                     else if (cmp > 0)
                         p = p.right;
                     else
                         return p;
                 }
             }
             return null;
         }
   
}
