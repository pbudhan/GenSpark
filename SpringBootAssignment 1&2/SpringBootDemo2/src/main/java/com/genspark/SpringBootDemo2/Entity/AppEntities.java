package com.genspark.SpringBootDemo2.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_Courses")
public class AppEntities {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String title;
    private String instructor;

    public AppEntities() {
    }

    public AppEntities(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseId() {

        return courseId;
    }

    public void setCourseId(int courseId) {

        this.courseId = courseId;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getInstructor() {

        return instructor;
    }

    public void setInstructor(String instructor) {

        this.instructor = instructor;
    }
}
