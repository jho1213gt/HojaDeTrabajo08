
package hdt8;

/**
 *
 * @author GNXN000000
 */
public class RedBlackCom implements WordSet{
	private RedBlackTree node;
	
	public RedBlackCom()
	{
		node = new RedBlackTree();
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

