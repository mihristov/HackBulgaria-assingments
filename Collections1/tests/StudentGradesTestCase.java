import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StudentGradesTestCase {
    StudentsUtil su;
    @Before
    public void setUp() throws Exception {
        su = new StudentsUtil();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        Student st2 = new Student("Petyo", 5);
        Student st1 = new Student("Milen", 6);
        Student st3 = new Student("Stefan", 3);
        Student st4 = new Student("Paco", 4);
        Student st5 = new Student("Paca", 4);
        Student st6 = new Student("Paci", 4);

        
        ArrayList<Student> input = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5, st6));
        su.sortStudents(input);
        
        ArrayList<Student> output = new ArrayList<>(Arrays.asList(st1, st2, st5, st6, st4, st3));
        
        assertEquals(output, input);
    }

}
