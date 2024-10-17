import static org.junit.Assert.*;
public class Test {


    @org.junit.Test
    public void testOne() {
        char[] t1 = {'b', 'a', 't'};
        char[] expected = {'t', 'l', 'b'};
        char[] test1 = Algorithms.reversecharArr(t1);
        assertArrayEquals(expected, test1);
    }

    @org.junit.Test
    public void testTwo() {
        char[] t2 = {'r', 'a', 'y'};
        char[] expected = {'y', 'a', 'r'};
        char[] test2 = Algorithms.reversecharArr(t2);
        assertArrayEquals(expected, test2);
    }

}
