import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ReverseUtilTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        ArrayList<Integer> secondList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        firstList = (ArrayList<Integer>) ReverseUtilClass.reverse(firstList);
        
        assertEquals(true, firstList.equals(secondList));
    }

}
