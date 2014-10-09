
package hdt8;

/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
* Codigo de parte de: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/BinaryNode.java
*/
public class BinaryNode
    {
            // Constructors
        BinaryNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

            // Friendly data; accessible by other package routines
        Comparable element;      // The data in the node
        BinaryNode left;         // Left child
        BinaryNode right;        // Right child
    }
