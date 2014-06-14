import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BracketsTestCase {
    public Brackets bracket;
    @Before
    public void setUp() throws Exception {
        bracket = new Brackets();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        assertEquals(true, bracket.isCorrect("()"));
    }
    
    @Test
    public void startTest() {
        assertEquals(false, bracket.isCorrect(")(()"));
    }
    
    @Test
    public void endsTest() {
        assertEquals(false, bracket.isCorrect("())("));
    }
    
    @Test
    public void openCountTest() {
        assertEquals(true, bracket.isCorrect("(())(())"));
    }
    
    @Test
    public void openFirstTest() {
        assertEquals(false, bracket.isCorrect("())(()"));
    }

}
