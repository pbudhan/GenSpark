package com.genspark.SpringBootDemo1.Service;

import com.genspark.SpringBootDemo1.Entity.AppEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImplementations implements AppServices{

    List<AppEntities> list;

    public ServiceImplementations() {
        list = new ArrayList<>();
        list.add(new AppEntities(101,"Spring Framework","Phaniesho"));
        list.add(new AppEntities(102,"Spring Boot","Pradeep"));
        list.add(new AppEntities(103,"Webb Applications","Toph"));


    }

    @Override
    public List<AppEntities> getAllCourses() {

        return list;
    }

    @Override
    public AppEntities getCourseById(int courseId) {
        for (AppEntities course: list) {
            if (course.getCourseId()==courseId){
                return course;
            }
        }
        return null;
    }

    @Override
    public AppEntities addCourse(AppEntities course) {
        list.add(course);
        return course;
    }

    @Override
    public AppEntities updateCourse(AppEntities course){
        String title = course.getTitle();
        String instructor = course.getInstructor();

        for (AppEntities c:list) {
            if (course.getCourseId()==c.getCourseId()){
                c.setTitle(title);
                c.setInstructor(instructor);
                return c;
            }
        }

        return null;
    }

    @Override
    public String deleteCourseById(int courseId) {
        for (AppEntities course:list) {
            if (courseId==course.getCourseId()){
                list.remove(course);
                return "course Removed";
            }
        }

        return "Course not found";
    }
}
