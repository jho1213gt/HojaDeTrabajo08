package hdt8;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Bucaro
 */
public class WordSetFactory {
	public static WordSet generateSet(String tipo){
            if(tipo.equals("SS"))
                return new SimpleSet();
            else if (tipo.equals("RBT"))
                return new RedBlackTree();
            else if (tipo.equals("ST"))
                return new SplayTree();
            else if (tipo.equals("HM"))
                return new HashMap();
            else if (tipo.equals("TM"))
                return new TreeMap();
            return null;
        }
        
        /*
        {
	    if (tipo == 1)
		    return new SimpleSet();
            if (tipo == 2)
                    return new RedBlackTree();
            if (tipo == 3)
                    return new SplayTree();
            if (tipo == 4)
                    return new HashMap();
            if (tipo == 5)  
                    return new TreeMap();
		    // aqui se regresara el set empleando sus implementaciones:
			// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
			// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
			// if tipo == 4 cree una instancia para un Wordset implementado con Hash table
			// if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
            return new SimpleSet(); //nunca 
	}
	*/
}
