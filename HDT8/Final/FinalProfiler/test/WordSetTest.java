
/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. DOuglas Barrios
* Miembros:
* - Max de Leon 13012
* - Javier Bucaro 13033
* - Kuk Ho Chung 13279
*/
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordSetTest {
    
    public WordSetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class WordSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = null;
        WordSet instance = new WordSetImpl();
        instance.add(wordObject);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class WordSet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        WordSet instance = new WordSetImpl();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class WordSetImpl implements WordSet {

        public void add(Word wordObject) {
        }

        public Word get(Word word) {
            return null;
        }
    }
    
}
