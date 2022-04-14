package com.lihu.dao;

import com.lihu.entity.CourseLesson;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (CourseLesson)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-14 13:47:07
 */
public interface CourseLessonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseLesson selectById(Object id);
	
    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseLesson> selectPage(@Param("start") int start, @Param("limit") int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<CourseLesson> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseLesson 实例对象
     * @return 对象列表
     */
    List<CourseLesson> selectList(CourseLesson courseLesson);

    /**
     * 新增数据
     *
     * @param courseLesson 实例对象
     * @return 影响行数
     */
    int insert(CourseLesson courseLesson);
	
	/**
     * 批量新增
     *
     * @param courseLessons 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(List<CourseLesson> courseLessons);
	
    /**
     * 修改数据
     *
     * @param courseLesson 实例对象
     * @return 影响行数
     */
    int update(CourseLesson courseLesson);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}