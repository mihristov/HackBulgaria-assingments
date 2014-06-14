import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseTestCase {
    public Reverse rev;

    @Before
    public void setUp() throws Exception {
        rev = new Reverse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        Collection<Integer> inputArr = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Collection<Integer> outputArr = new ArrayList<Integer>(Arrays.asList(3,2,1));
        rev.reverseCollection(inputArr);
        
        assertEquals(outputArr, inputArr);
    }
    
    @Test
    public void standartTest1() {
        Collection<Integer> inputArr = new Stack<Integer>();
        Collection<Integer> outputArr = new Stack<Integer>();
        inputArr.addAll(Arrays.asList(1,2,3,4,5));
        outputArr.addAll(Arrays.asList(5,4,3,2,1));
        rev.reverseCollection(inputArr);
        
        assertEquals(outputArr, inputArr);
    }
}
