package repos.impl;

import data.StudentsData;
import models.Course;
import models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import repos.StudentRepo;

import java.util.ArrayList;
import java.util.List;


@Component
@Qualifier("sri")
public class StudentRepoImpl implements StudentRepo {


    @Override
    public boolean addStudent(Student stu) {
        try{
            StudentsData.studentList.add(stu);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean editStudent(String id, Student stu) {
        try{
            for(Student s : StudentsData.studentList){
                if(s.getId().equals(id)){
                    StudentsData.studentList.add(StudentsData.studentList.indexOf(s), stu);
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
    public Student getStudent(String id) {
        try{
            for(Student s : StudentsData.studentList){
                if(s.getId().equals(id)){
                    return s;
                }
            }
            return new Student();
        }catch (Exception e){
            System.out.println(e);
            return new Student();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return StudentsData.studentList;
    }

    @Override
    public boolean deleteStudent(String id) {
        try{
            for(Student s : StudentsData.studentList){
                if(s.getId().equals(id)){
                    //not a good way for large data (O(n^2))
                    StudentsData.studentList.remove(StudentsData.studentList.indexOf(s));
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
    public List<Student> getStudentsByMajor(String major) {
        List<Student> stl = new ArrayList<>();
        try{
            for(Student s:StudentsData.studentList){
                if(s.getMajor().equals(major))
                    stl.add(s);
            }
            return stl;
        }catch (Exception e){
            return stl;
        }
    }

    @Override
    public List<Course> getCoursesByStudentId(String studentId) {
        try{
            for(Student s : StudentsData.studentList){
                if(s.getId().equals(studentId)){
                    return s.getCoursesTaken();
                }
            }
            return null;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}


