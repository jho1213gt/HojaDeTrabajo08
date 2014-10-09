
import java.util.TreeMap;

public class TreeMap implements WordSet{
    private TreeMap<String, String> Map;
    
    public TreeMap(){
        Map = new TreeMap();
    }

    public void add(Word wordObject) {
		Map.put(wordObject.getWord(), wordObject.getType());
    }

    public Word get(Word word) {
		if (!(Map.containsKey(word.getWord())))
			return null;
		return new Word(word.getWord(), Map.get(word.getWord()));
    }
    
    
}