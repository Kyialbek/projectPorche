package project1;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;
public class TestTest {
    @Test
    public void testForLoop1() {
        int[] oddNumbers= {3,5,7,9};
        assertEquals(oddNumbers,projectLoops.forLoop1(10));
    }
    
    @Test
    public void   testForLoop2() {
        int[] divNumbers= {15,30,45};
        assertEquals(divNumbers,projectLoops.forLoop2(50));
    }
    
    @Test
    public void testForLoop3() {
        int[] primeNumbers= {1,13,23};
        assertEquals(primeNumbers,projectLoops.forLoop3(25));
    }
    
    @Test
    public void testForLoop4() {
        String vowel= "vowel";
        String constant="constant";
        assertEquals(vowel,projectLoops.forLoop4('a').toLowerCase());
        assertEquals(vowel,projectLoops.forLoop4('e').toLowerCase());
        assertEquals(vowel,projectLoops.forLoop4('u').toLowerCase());
        assertEquals(vowel,projectLoops.forLoop4('i').toLowerCase());
        assertEquals(constant,projectLoops.forLoop4('b').toLowerCase());
        assertEquals(constant,projectLoops.forLoop4('x').toLowerCase());
        assertEquals(constant,projectLoops.forLoop4('w').toLowerCase());
    }
    
    @Test
    public void testCoins() {
        int[] coins1= {25,5,10,25,5,10};
        assertEquals("You have 2 quarters, 2 dime, and 2 nickels.",projectLoops.coins(coins1));
        int[] coins2= {25,25,5,10};
        assertEquals("You have 2 quarters, 1 dime, and 1 nickels.",projectLoops.coins(coins2));
        int[] coins3= {25,5,10,25,5,10,10,10,5};
        assertEquals("You have 2 quarters, 4 dime, and 3 nickels.",projectLoops.coins(coins3));
    }
    
}
