package com.lihu.controller;

import com.lihu.entity.Course;
import com.lihu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lihu
 * @PROJECT_NAME: online_edu
 * @DESCRIPTION:
 * @USER: Irene-Jisoo
 * @DATE: 2022/4/14 14:16
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * 测试一下
     * @return
     */
    @RequestMapping("/test")
    public List<Course> test(){
        List<Course> courses = courseService.selectAll();
        return courses;
    }
}
