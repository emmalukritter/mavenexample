import org.junit.Assert;
import org.mockito.Mockito;
import org.testng.annotations.Test;
public class newtesting {
    @Test
    public void testing()

    {
        newtest person = new newtest();

        newtest person1 = Mockito.spy(person);

        Mockito.doReturn(true).when(person1).first(0);

        Assert.assertEquals(1, person1.second());
    }
}

