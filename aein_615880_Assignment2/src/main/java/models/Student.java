package models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> coursesTaken;


    public Student() {
    }

    public Student(String id, String firstName, String lastName, String email, String major, List<Course> coursesTaken) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.coursesTaken = coursesTaken;
    }


}
