package repos;

import models.Course;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
public interface CourseRepo {

    boolean addCourse(Course stu);
    boolean editCourse(String id, Course cou);
    Course getCourse(String id);
    List<Course> getAllCourses();
    boolean deleteCourse(String id);
}
