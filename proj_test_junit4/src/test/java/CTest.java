import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.HashSet;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CTest {
    C c = new C();

    @Before public void testC0Initializer(){
        c.setHashSet(new HashSet<B>(Arrays.asList(new B(1),
                new B(2))));
    }

    @Test
    public void testC1() {

        System.out.println("C1");
        Assert.assertEquals("helloC", new C().helloC());
    }

    @Test
    public void testC2() {
        System.out.println("C2");


        Assert.assertTrue(c.hashsetToString().equals("[1, 2]")||c.hashsetToString().equals("[2, 1]"));
    //    Assert.assertEquals("[3, 2]",c.hashsetToString());
    }

    @Test
    public void testC3() {
        System.out.println("C3");
        Assert.assertTrue(c.hashsetToString().equals("[1, 2]")||c.hashsetToString().equals("[2, 1]"));
//        Assert.assertEquals("[1, 2]",c.hashsetToString());

    }



}