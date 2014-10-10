

/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
*/
public class RedBlackCom implements WordSet{
    RedBlackTree arbol;
    
    public RedBlackCom(){
        arbol = new RedBlackTree(new Word());
    }
    
    public Word get(Word word){
        Word temp;
        temp =(Word) arbol.find(word);
        return temp;
    }
    
    public void add(Word word){
        arbol.insert(word);
    }
}