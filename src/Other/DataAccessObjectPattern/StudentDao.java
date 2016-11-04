package Other.DataAccessObjectPattern;

import java.util.List;

/**
 * Created by tianf on 2016/8/19.
 */
public interface StudentDao {

    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
