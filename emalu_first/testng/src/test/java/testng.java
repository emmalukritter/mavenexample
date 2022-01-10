import org.testng.Assert;
import org.testng.annotations.Test;
public class testng {

    testngsample test=new testngsample();
    /*========================TEST 1=================================================*/
    /* Test case for checking the prime number
    sample input is 3 and we need to get 3 is a prime number
     */
    @Test
        public void prime() {
            Assert.assertTrue(test.checkPrime(3));
    }
    /*======================================TEST 2=========================================
    Test case for square root
    we give sample input 25 and get 5 as output
     */
    @Test
    public void sqrt() {
        Assert.assertEquals(test.squareRoot(25),5);
        Assert.assertEquals(test.squareRoot(4),2);
    }
}

