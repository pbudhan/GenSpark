package com.genspark.SpringBootDemo1.Service;


import com.genspark.SpringBootDemo1.Entity.AppEntities;

import java.util.List;

public interface AppServices {
    List<AppEntities> getAllCourses();
    AppEntities getCourseById(int courseId);
    AppEntities addCourse(AppEntities course);
    AppEntities updateCourse(AppEntities course);
    String deleteCourseById(int courseId);

}
