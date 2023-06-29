package repos.impl;

import data.CourseData;
import data.StudentsData;
import models.Course;
import models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import repos.CourseRepo;
import repos.StudentRepo;

import java.util.List;


@Qualifier("cri")
@Component
public class CourseRepoImpl implements CourseRepo {




    @Override
    public boolean addCourse(Course cou) {
        try{
            CourseData.courseList.add(cou);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean editCourse(String id, Course cou) {
        try{
            for(Course c : CourseData.courseList){
                if(c.getId().equals(id)){
                    CourseData.courseList.add(CourseData.courseList.indexOf(c), cou);
                    break;
                }
            }
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public Course getCourse(String id) {
        try{
            for(Course c : CourseData.courseList){
                if(c.getId().equals(id)){
                    return c;
                }
            }
            return new Course();
        }catch (Exception e){
            System.out.println(e);
            return new Course();
        }
    }

    @Override
    public List<Course> getAllCourses() {
        return CourseData.courseList;
    }

    @Override
    public boolean deleteCourse(String id) {
        try{
            for(Course c : CourseData.courseList){
                if(c.getId().equals(id)){
                    //not a good way for large data (O(n^2))
                    CourseData.courseList.remove(CourseData.courseList.indexOf(c));
                    break;
                }
            }
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}


