package com.example.springrestapi.dao;

import com.example.springrestapi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}
