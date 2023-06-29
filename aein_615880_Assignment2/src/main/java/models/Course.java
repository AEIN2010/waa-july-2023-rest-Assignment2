package models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {


    private String id;
    private String name;
    private String code;

    public Course() {
    }

    public Course(String id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
