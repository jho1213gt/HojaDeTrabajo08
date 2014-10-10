/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt8;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier Bucaro
 */
public class SplayTreeNodeTest {
    
    public SplayTreeNodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of get method, of class SplayTreeNode.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = new Word("matar","verbo");
        SplayTreeNode instance = new SplayTreeNode();
        Word expResult = new Word("matar","verbo");
        instance.add(word);
        instance.add(expResult);
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SplayTreeNode.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word("matar","verbo");
        SplayTreeNode instance = new SplayTreeNode();
        instance.add(wordObject);
        Word ExpwordObject = new Word("matar","verbo");
        assertEquals(ExpwordObject,wordObject);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
