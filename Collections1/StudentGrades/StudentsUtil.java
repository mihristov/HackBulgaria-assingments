import java.util.List;

public class StudentsUtil {
    public void sortStudents(List<Student> people){
        for(Student st1 : people){
            for(Student st : people){
                if (st.compareTo(st1) > 0){
                    Student temp = new Student(st1);
                    st1 = st;
                    st = new Student(temp);
                }
            }
        }
    }
}
