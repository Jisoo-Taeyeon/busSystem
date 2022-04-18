package com.ssm.controller;

import com.ssm.entity.Course;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lyc
 * @PROJECT_NAME: online_edu
 * @DESCRIPTION:
 * @DATE: 2022/4/14 14:16
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * 测试 查询全部
     * @return
     */
    @RequestMapping("/test")
    public List<Course> test(){
        List<Course> courses = courseService.selectAll();
        return courses;
    }

    /**
     * 测试 通过ID查询单条数据
     * @return
     */
    @RequestMapping("/test1")
    public Course test1(){
        Course course = courseService.selectById("1");
        return course;
    }

    /**
     * 测试 分页查询
     * @return
     */
    @RequestMapping("/test2")
    public List<Course> test2(){
        List<Course> courses = courseService.selectPage(1,3);
        return courses;
    }

    /**
     * 测试 通过主键删除数据
     * @return
     */
    @RequestMapping("/test3")
    public void test3(int i){
        courseService.deleteById(i);
    }


}
