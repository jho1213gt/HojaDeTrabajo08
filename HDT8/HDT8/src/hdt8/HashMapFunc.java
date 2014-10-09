
package hdt8;

/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
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
