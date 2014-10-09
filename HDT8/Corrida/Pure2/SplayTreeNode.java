/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
