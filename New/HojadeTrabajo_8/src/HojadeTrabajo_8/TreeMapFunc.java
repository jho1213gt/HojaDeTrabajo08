package HojadeTrabajo_8;

import java.util.TreeMap;
/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
*/
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


