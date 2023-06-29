package data;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsData {
    public static List<Student> studentList = new ArrayList<>();

    // Create a list to store the Student objects


    // Create 10 instances of Student and add them to the list
    Student student1 = new Student("1", "John", "Doe", "john.doe@example.com", "Computer Science", CourseData.courseList.subList(0, 2));
    Student student2 = new Student("2", "Jane", "Smith", "jane.smith@example.com", "Electrical Engineering", CourseData.courseList.subList(0, 1));
    Student student3 = new Student("3", "Michael", "Johnson", "michael.johnson@example.com", "Business Administration", CourseData.courseList.subList(1, 3));
    Student student4 = new Student("4", "Emily", "Davis", "emily.davis@example.com", "Psychology", CourseData.courseList.subList(3, 4));
    Student student5 = new Student("5", "David", "Wilson", "david.wilson@example.com", "Mechanical Engineering", CourseData.courseList.subList(4, 5));
    Student student6 = new Student("6", "Sarah", "Anderson", "sarah.anderson@example.com", "Computer Science", CourseData.courseList.subList(0, 1));
    Student student7 = new Student("7", "Daniel", "Brown", "daniel.brown@example.com", "Physics", CourseData.courseList.subList(1, 2));
    Student student8 = new Student("8", "Olivia", "Taylor", "olivia.taylor@example.com", "English Literature", CourseData.courseList.subList(2, 3));
    Student student9 = new Student("9", "Matthew", "Moore", "matthew.moore@example.com", "Mathematics", CourseData.courseList.subList(3, 4));
    Student student10 = new Student("10", "Sophia", "Clark", "sophia.clark@example.com", "Chemistry", CourseData.courseList.subList(4, 5));


    public StudentsData() {
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
    }
}
