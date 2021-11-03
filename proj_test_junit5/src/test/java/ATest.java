import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ATest {
    private int num = 0;

    @Test
    public void testA1() {
        System.out.println("A1");
        Assertions.assertEquals("helloA", new A().helloA());
    }

    @Test
    public void testA2() {
        System.out.println("A2");
        Assertions.assertEquals(0, num);
        Assertions.assertEquals(0, num);
    }

    @Test
    public void testA3() {
        System.out.println("A3");
        num++;
        Assertions.assertEquals(1, num);
    }
}