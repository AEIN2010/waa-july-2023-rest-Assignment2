package data;

import models.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseData {

    public static List<Course> courseList = new ArrayList<>();

    // Create 5 instances of Course and add them to the list
    Course course1 = new Course("1", "Course 1", "CSE101");
    Course course2 = new Course("2", "Course 2", "ENG201");
    Course course3 = new Course("3", "Course 3", "MAT301");
    Course course4 = new Course("4", "Course 4", "SCI401");
    Course course5 = new Course("5", "Course 5", "HIS501");

    public CourseData() {
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);
    }
}
