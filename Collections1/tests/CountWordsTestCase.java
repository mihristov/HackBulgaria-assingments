import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CountWordsTestCase {
    private CountWords cw;
    private HashMapUtilClass hashUtil;
    @Before
    public void setUp() throws Exception {
        cw = new CountWords();
        hashUtil = new HashMapUtilClass();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {        
        assertEquals("{ Ninjas:1, are:2, all:2, over:1, the:1, place!:1, We:1, going:1, to:1, die!:1 }",
                hashUtil.HashMapUtilMethod(
                        cw.countWordsMethod("Ninjas are all over the place! We are all going to die!")));
    }

}
