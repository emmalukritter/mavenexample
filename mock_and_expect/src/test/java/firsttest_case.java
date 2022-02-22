import mockit.*;
import org.junit.Assert;
import org.testng.annotations.Test;

public class firsttest_case {
    @Injectable
    firsttest f1;
/* ==========================TEST 1==========================
using mockup
 */

    @Test
    public void testcase1() {
        new MockUp<firsttest>() {
            @Mock
            public boolean first(int i) {
                return true;
            }
        };

        Assert.assertEquals(1, f1.second());
    }
    /* ==========================TEST 2==========================
using Expectation
 */
    @Test
    public void testcase2() {
        new Expectations() {
            {
                f1.first(0);
                result = true;
            }
        };
        int i=f1.second();
        System.out.println(i);
        Assert.assertEquals(1, i);
    }


}
