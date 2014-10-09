
/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
* Codigo de parte de: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/RedBlackNode.java
*/

public class RedBlackNode
    {
            // Constructors
        RedBlackNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt )
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

