class RedBlackTreeNode implements WordSet
{
	private RedBlackTree node;
	
	public RedBlackTreeNode()
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

	RedBlackNodeTree( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackTreeNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        Comparable   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color	
	
}
