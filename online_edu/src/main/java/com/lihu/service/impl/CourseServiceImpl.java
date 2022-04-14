package com.lihu.service.impl;

import com.lihu.entity.Course;
import com.lihu.dao.CourseDao;
import com.lihu.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Course表)服务实现类
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Course selectById(Object id) {
        return this.courseDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Course> selectPage(int start, int limit) {
        return this.courseDao.selectPage(start, limit);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
     @Override
     public List<Course> selectAll() {
        return this.courseDao.selectAll();
     }
     
    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Course> selectList(Course course) {
        return this.courseDao.selectList(course);
    }
    
    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Course course) {
        return this.courseDao.insert(course);
    }

    /**
     * 批量新增
     *
     * @param courses 实例对象的集合
     * @return 生效的条数
     */
    @Override
    public int batchInsert(List<Course> courses) {
        return this.courseDao.batchInsert(courses);
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course update(Course course) {
        this.courseDao.update(course);
        return this.selectById(course.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Object id) {
        return this.courseDao.deleteById(id);
    }
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
     @Override
     public int count(){
        return this.courseDao.count();
     }
}