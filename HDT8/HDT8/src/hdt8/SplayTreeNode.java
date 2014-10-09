/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
*/

package hdt8;

/**
 *
 * @author GNXN000000
 */
class SplayTreeNode implements WordSet
{
	private SplayTree node;
	
	public SplayTreeNode()
	{
		node = new SplayTree();
	}
	
	public Word get(Word word)
	{
		Word dato = (Word)node.find(word);
		return dato;
	}
	
	public void add(Word wordObject)
	{
		node.insert(wordObject);
	}
}
