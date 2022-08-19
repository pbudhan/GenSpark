package com.genspark.SpringBootDemo1.Controller;

import com.genspark.SpringBootDemo1.Entity.AppEntities;
import com.genspark.SpringBootDemo1.Service.AppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AppControllers {

    @Autowired
    private AppServices courseService;

    @GetMapping("/")
    public String home(){

        return "<HTML><H1>Welcome to My First Spring Boot Application!</H1></HTML>";
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
