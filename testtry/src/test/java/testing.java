import org.junit.Assert;
import org.testng.annotations.Test;
import org.mockito.Mockito;
public class testing {
    @Test
     public void testing()

    {
        testsample person = new testsample();

        testsample person1 = Mockito.spy(person);

        Mockito.doReturn(200).when(person1).pressAccelerator();

        Assert.assertEquals(200, person1.speed());
    }
}
