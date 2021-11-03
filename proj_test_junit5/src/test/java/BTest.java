import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BTest {
    @Test
    public void testB1() {
        System.out.println("B1");
        Assertions.assertEquals("helloB", new B().helloB());
    }

    @Test
    public void testB2() {
        System.out.println("B2");
        Assertions.assertEquals(0, new B().getbNum());
    }

    @Test
    public void testB3() {
        System.out.println("B3");
        B b=new B();
        b.setbNum(1);
        Assertions.assertEquals(1, b.getbNum());
    }
}