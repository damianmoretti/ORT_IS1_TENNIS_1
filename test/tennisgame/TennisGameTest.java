package tennisgame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gaston
 */
public class TennisGameTest {
    TennisGame game = null;
    
    public TennisGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testLoveAll(){
        System.out.println("1. - Love all");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Love all";
        String result = game.getScore();
        assertEquals(expResult, result);
    }
  
    
   
 
}
