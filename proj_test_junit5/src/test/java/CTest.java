import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CTest {
    static C c = new C();

    @BeforeAll public static void testC0Initializer(){
        c.setHashSet(new HashSet<B>(Arrays.asList(new B(1),
                new B(2))));
    }

    @Test
    public void testC1() {

        System.out.println("C1");
        Assertions.assertEquals("helloC", new C().helloC());
    }

    @Test
    public void testC2() {
        System.out.println("C2");
        Assertions.assertTrue(c.hashsetToString().equals("[1, 2]")||c.hashsetToString().equals("[2, 1]"));
    //    Assertions.assertEquals("[3, 2]",c.hashsetToString());
    }

    @Test
    public void testC3() {
        System.out.println("C3");
        Assertions.assertTrue(c.hashsetToString().equals("[1, 2]")||c.hashsetToString().equals("[2, 1]"));
//        Assert.assertEquals("[1, 2]",c.hashsetToString());

    }



}