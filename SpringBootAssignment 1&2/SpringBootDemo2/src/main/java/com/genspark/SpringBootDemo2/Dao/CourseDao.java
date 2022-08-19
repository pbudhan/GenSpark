package com.genspark.SpringBootDemo2.Dao;

import com.genspark.SpringBootDemo2.Entity.AppEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<AppEntities,Integer> {
}
