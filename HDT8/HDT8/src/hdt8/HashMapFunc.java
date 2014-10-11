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
// Se implementa nuestra interface 
public class HashMapFunc implements WordSet{
// Creamos un objeto de tipo HashMap (importando JCF)
    private HashMap<String, String> Map;
// Constructor    
     public HashMapFunc(){
       Map = new HashMap();
    }
// Método para agregar un nuevo objeto de tipo Word
    public void add(Word wordObject) {
        Map.put(wordObject.getWord(),wordObject.getType() );
    }
// Método para obtener los valores de un objeto determinado
    public Word get(Word word) {
        if (!(Map.containsKey(word.getWord())))
            return null;
        return new Word(word.getWord(), Map.get(word.getWord()));
    }    
}
