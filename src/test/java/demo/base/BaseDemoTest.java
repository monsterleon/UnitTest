package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }
    @Test
    public void should_return_sum15() {
        BaseDemo baseDemo = new BaseDemo();
        int sum = 15;
        assertEquals(sum, baseDemo.sum(10,5));
    }
    @Test
    public void should_return_sum25() {
        BaseDemo baseDemo = new BaseDemo();
        int sum = 25;
        assertEquals(sum, baseDemo.sum(10,15));
    }
}
