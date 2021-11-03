import org.junit.Assert;
import org.junit.Test;

public class BTest {
    @Test
    public void testB1() {
        System.out.println("B1");
        Assert.assertEquals("helloB", new B().helloB());
    }

    @Test
    public void testB2() {
        System.out.println("B2");
        Assert.assertEquals(0, new B().getbNum());
    }

    @Test
    public void testB3() {
        System.out.println("B3");
        B b=new B();
        b.setbNum(1);
        Assert.assertEquals(1, b.getbNum());
    }
}