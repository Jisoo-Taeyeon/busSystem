package com.lihu;

import com.lihu.entity.Course;
import com.lihu.service.CourseService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class OnlineEduApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CourseService courseService;
    @Test
    public void testFindAll(){
        List<Course> courses = courseService.selectAll();
        courses.forEach(System.out::println);
    }

}
