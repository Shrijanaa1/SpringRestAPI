package com.example.springrestapi.services;

import com.example.springrestapi.dao.CourseDao;
import com.example.springrestapi.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceimpl implements CourseService{

    @Autowired
    private CourseDao courseDao;


//    List<Course> list;

    public CourseServiceimpl(){
//        list = new ArrayList<>();
//        list.add(new Course(123, "Java Core Course","this course contains basics of JavaCore"));
//        list.add(new Course(456, "Spring Boot Course","this course contains basics of SpringBoot"));

    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    @SuppressWarnings("deprecation")
    public Course getCourse(long courseId) {
//        Course c = null;
//        for(Course course: list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach( e->{
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;

        //if doesn't exist creates and add one
        //if already exist details update garcha
    }

    @Override
    @SuppressWarnings("deprecation")
    public void deleteCourse(long parseLong) {
//        list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }
}
