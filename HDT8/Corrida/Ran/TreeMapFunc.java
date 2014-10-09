

/**
 *
 * @author GNXN000000
 */
import java.util.TreeMap;

public class TreeMapFunc implements WordSet{

    
    private TreeMap<String, String> Map;
    
     public TreeMapFunc(){
       Map = new TreeMap();
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

