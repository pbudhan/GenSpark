package com.genspark.SpringBootDemo2.Controller;

import com.genspark.SpringBootDemo2.Entity.AppEntities;
import com.genspark.SpringBootDemo2.Service.AppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppControllers {

    @Autowired
    private AppServices courseService;

    @GetMapping("/")
    public String home(){

        return "<HTML><H1>Hello World! Welcome To Course Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<AppEntities> getCourses(){

        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public AppEntities getCourse(@PathVariable String courseId){
        return this.courseService.getCourseById(Integer.parseInt(courseId));
    }
    @PostMapping("/courses")
    public AppEntities addCourse(@RequestBody AppEntities course){

        return this.courseService.addCourse(course);
    }
    @PutMapping("/courses")
    public AppEntities updateCourse(@RequestBody AppEntities course){

        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public String deleteCourseById(@PathVariable String courseId){
        return this.courseService.deleteCourseById(Integer.parseInt(courseId));
    }


}
