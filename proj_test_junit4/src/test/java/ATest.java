import org.junit.Assert;
import org.junit.Test;

public class ATest {
    private int num=0;

    @Test
    public void testA1() {
        System.out.println("A1");
        Assert.assertEquals("helloA", new A().helloA());
    }

    @Test
    public void testA2() {
        System.out.println("A2");
        Assert.assertEquals(0, num);
        Assert.assertEquals(0, num);
    }

    @Test
    public void testA3() {
        System.out.println("A3");
        num++;
        Assert.assertEquals(1, num);
    }

}