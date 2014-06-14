import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FirstUniqueTestCase {
    FirstUnique fu;
    @Before
    public void setUp() throws Exception {
        fu = new FirstUnique();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
        assertEquals((Integer)2, fu.getFirstDuplicate(ints));
    }

}
