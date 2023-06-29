package repos;

import models.Course;
import models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("sri")
public interface StudentRepo {
    boolean addStudent(Student stu);
    boolean editStudent(String id, Student stu);
    Student getStudent(String id);
    List<Student> getAllStudents();
    boolean deleteStudent(String id);
    List<Student> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(String studentId);
}
