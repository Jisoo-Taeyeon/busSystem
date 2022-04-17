package com.ssm.service.impl;

import com.ssm.dao.CourseLessonDao;
import com.ssm.entity.CourseLesson;
import com.ssm.service.CourseLessonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CourseLesson表)服务实现类
 *
 * @author makejava
 * @since 2022-04-14 13:47:08
 */
@Service("courseLessonService")
public class CourseLessonServiceImpl implements CourseLessonService {
    @Resource
    private CourseLessonDao courseLessonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseLesson selectById(Object id) {
        return this.courseLessonDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseLesson> selectPage(int start, int limit) {
        return this.courseLessonDao.selectPage(start, limit);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
     @Override
     public List<CourseLesson> selectAll() {
        return this.courseLessonDao.selectAll();
     }
     
    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<CourseLesson> selectList(CourseLesson courseLesson) {
        return this.courseLessonDao.selectList(courseLesson);
    }
    
    /**
     * 新增数据
     *
     * @param courseLesson 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(CourseLesson courseLesson) {
        return this.courseLessonDao.insert(courseLesson);
    }

    /**
     * 批量新增
     *
     * @param courseLessons 实例对象的集合
     * @return 生效的条数
     */
    @Override
    public int batchInsert(List<CourseLesson> courseLessons) {
        return this.courseLessonDao.batchInsert(courseLessons);
    }

    /**
     * 修改数据
     *
     * @param courseLesson 实例对象
     * @return 实例对象
     */
    @Override
    public CourseLesson update(CourseLesson courseLesson) {
        this.courseLessonDao.update(courseLesson);
        return this.selectById(courseLesson.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Object id) {
        return this.courseLessonDao.deleteById(id);
    }
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
     @Override
     public int count(){
        return this.courseLessonDao.count();
     }
}