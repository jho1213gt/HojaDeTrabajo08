

/**
 *
 * @author GNXN000000
 */
import java.util.HashMap;

public class HashMapFunc implements WordSet{
    
    private HashMap<String, String> Map;
    
     public HashMapFunc(){
       Map = new HashMap();
    }
    
    public void add(Word wordObject) {
        Map.put(wordObject.getWord(),wordObject.getType() );
    }

    public Word get(Word word) {
        if (!(Map.containsKey(word.getWord())))
            return null;
        return new Word(word.getWord(), Map.get(word.getWord()));
    }    
    
}
