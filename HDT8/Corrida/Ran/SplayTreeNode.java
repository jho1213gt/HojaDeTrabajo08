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
