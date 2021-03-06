import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HashMapTestCase {
    private HashMapUtilClass ins;
    @Before
    public void setUp() throws Exception {
        ins = new HashMapUtilClass();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        HashMap<Character, Integer> input = new LinkedHashMap<>();
        input.put('a', 1);
        input.put('b', 2);
        input.put('c', 3);
        
        assertEquals("{ a:1, b:2, c:3 }", ins.HashMapUtilMethod(input));
    }

}
