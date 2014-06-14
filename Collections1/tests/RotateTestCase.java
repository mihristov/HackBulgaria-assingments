import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RotateTestCase {
    
    public RotateElements rotate;
    @Before
    public void setUp() throws Exception {
        rotate = new RotateElements();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void positiveTest() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        rotate.rotate(input, 2);
        
        assertEquals(Arrays.asList(4,5,1,2,3), input);
    }
    
    @Test
    public void negativeTest() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        rotate.rotate(input, -1);
        
        assertEquals(Arrays.asList(2,3,4,5,1), input);
    }

}
