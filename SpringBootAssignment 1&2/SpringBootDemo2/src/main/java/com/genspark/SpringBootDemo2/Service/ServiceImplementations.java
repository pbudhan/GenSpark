package com.genspark.SpringBootDemo2.Service;

import com.genspark.SpringBootDemo2.Dao.CourseDao;
import com.genspark.SpringBootDemo2.Entity.AppEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplementations implements AppServices{
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<AppEntities> getAllCourses() {

        return this.courseDao.findAll() ;
    }

    @Override
    public AppEntities getCourseById(int courseId) {
        Optional<AppEntities> c = this.courseDao.findById(courseId);
        AppEntities course;
        if (c.isPresent()){
            course=c.get();
        }else {
            throw new RuntimeException("Course not found id: "+courseId);
        }
        return course;
    }

    @Override
    public AppEntities addCourse(AppEntities course) {

        return this.courseDao.save(course);
    }

    @Override
    public AppEntities updateCourse(AppEntities course){

        return this.courseDao.save(course);
    }

    @Override
    public String deleteCourseById(int courseId) {

        this.courseDao.deleteById(courseId);
        return "Deleted";
    }
}
