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
public class RedBlackComTest {
    
    public RedBlackComTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of get method, of class RedBlackCom.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = new Word("chung","sustantivo");
        RedBlackCom instance = new RedBlackCom();
        instance.add(word);
        Word wordResult = new Word("chung","sustantivo");
        instance.add(wordResult);
        Word result = instance.get(word);
        Word expResult = instance.get(wordResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class RedBlackCom.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word word = new Word("chung","sustantivo");
        RedBlackCom instance = new RedBlackCom();
        instance.add(word);
        Word expResult = new Word("chung","sustantivo");
        assertEquals(expResult,word);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
