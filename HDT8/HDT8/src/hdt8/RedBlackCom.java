
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
// Se implementa nuestra interface
public class RedBlackCom implements WordSet{
// Se crea un objeto de tipo RedBlackTree    
    RedBlackTree arbol;
// Constructor
    public RedBlackCom(){
        arbol = new RedBlackTree(new Word());
    }
// Mëtodo para obtener un valor del RedBlackTree 
    public Word get(Word word){
        Word temp;
// Se llama al método find de la clase RedBlackTree
        temp =(Word) arbol.find(word);
        return temp;
    }
// Método para obtener un valor determinado    
    public void add(Word word){
        arbol.insert(word);
    }
}
