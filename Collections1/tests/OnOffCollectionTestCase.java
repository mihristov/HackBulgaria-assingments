import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OnOffCollectionTestCase {
    public OnOffCollection<Integer> myCol;

    @Before
    public void setUp() throws Exception {
        myCol = new OnOffCollection<Integer>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest1() {
        myCol.add(5);
        myCol.add(4);

        assertEquals(true, myCol.contains(5));
    }

    @Test
    public void standartTest2() {
        myCol.add(5);
        myCol.add(4);
        myCol.add(5);
        
        assertEquals(false, myCol.contains(5));
    }

    @Test
    public void nullTest() {
        myCol.add(5);
        myCol.add(null);
        
        assertEquals(false, myCol.contains(null));
    }

}
