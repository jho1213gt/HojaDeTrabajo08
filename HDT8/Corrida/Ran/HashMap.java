/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Bucaro
 */
 
import java.util.HashMap;

public class HashMap implements WordSet{
    private HashMap<String, String> Map;
    
    public HashMap(){
        Map = new HashMap();
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
