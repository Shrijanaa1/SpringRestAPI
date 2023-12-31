package com.example.springrestapi.services;

import com.example.springrestapi.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);

   public Course addCourse(Course course);

   public Course updateCourse(Course course);

   void deleteCourse(long parseLong);
}
