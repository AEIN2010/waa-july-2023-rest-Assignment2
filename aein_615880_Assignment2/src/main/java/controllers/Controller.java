package controllers;


import data.CourseData;
import data.StudentsData;
import models.Course;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import repos.impl.CourseRepoImpl;
import repos.impl.StudentRepoImpl;

import java.io.File;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/mySystem")
public class Controller {



    @Qualifier("sri")
    @Autowired()
    StudentRepoImpl sri;

    @Qualifier("cri")
    @Autowired
    CourseRepoImpl cri;

    CourseData cd = new CourseData();
    StudentsData sd = new StudentsData();

    @GetMapping("/students/{id}")
    @ResponseBody
    Student getStudent(@PathVariable("id") String id){
        return sri.getStudent(id);
    }

    @GetMapping("/studentsMajor/{major}")
    @ResponseBody
    List<Student> getStudentByMajor(@PathVariable("major") String major){
        return sri.getStudentsByMajor(major);
    }

    @GetMapping("/students/{id}/courses")
    @ResponseBody
    List<Course> getStudentMajor(@PathVariable("id") String id){
        return sri.getCoursesByStudentId(id);
    }

    @PutMapping("/students/{id}")
    @ResponseBody
    boolean updateStudent(@PathVariable("id") String id, @RequestBody Student s){
        return sri.editStudent(id, s);
    }

    @GetMapping("/students")
    @ResponseBody
    List<Student> getAllStudents(){
        return sri.getAllStudents();
    }

    @DeleteMapping("/students/{id}")
    @ResponseBody
    boolean deleteStudent(@PathVariable("id") String id){
        return sri.deleteStudent(id);
    }

    @PostMapping("/students")
    @ResponseBody
    boolean addStudent(@RequestBody Student stu){
        if(stu != null)
            return sri.addStudent(stu);
        else
            return false;
    }


    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/courses/{id}")
    @ResponseBody
    Course getCourse(@PathVariable("id") String id){
        return cri.getCourse(id);
    }


    @PutMapping("/courses/{id}")
    @ResponseBody
    boolean updateCourse(@PathVariable("id") String id, @RequestBody Course c){
        return cri.editCourse(id, c);
    }

    @GetMapping("/courses")
    @ResponseBody
    List<Course> getAllCourses(){
        return cri.getAllCourses();
    }

    @DeleteMapping("/courses/{id}")
    @ResponseBody
    boolean deleteCourse(@PathVariable("id") String id){
        return cri.deleteCourse(id);
    }

    @PostMapping("/courses")
    @ResponseBody
    boolean addCourse(@RequestBody Course cou){
        if(cou != null)
            return cri.addCourse(cou);
        else
            return false;
    }






//    @RequestMapping("/")
//    String startapp(Model model){
//        String path = "../../resources/templates"; // Set the path to the desired directory
//        File directory = new File(path);
//        File[] files = directory.listFiles();
//
//        model.addAttribute("files", files);
//        return "page";
//    }

}
