import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MonotonousTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest1() {
        assertEquals(true, MonotonousUtilClass.isMonotonous(Arrays.asList(1,2,3,4,5,6)));
    }

    @Test
    public void standartTest2() {
        assertEquals(true, MonotonousUtilClass.isMonotonous(Arrays.asList(6,5,4,3,2,1,1,1)));
    }
    
    @Test
    public void standartTest3() {
        assertEquals(false, MonotonousUtilClass.isMonotonous(Arrays.asList(1,2,1,4,5,4)));
    }
}
