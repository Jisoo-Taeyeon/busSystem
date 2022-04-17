package com.ssm.service;

import com.ssm.entity.Course;

import java.util.List;

/**
 * (Course)表服务接口
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public interface CourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Course selectById(Object id);

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Course> selectPage(int start, int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Course> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param course 实例对象
     * @return 对象列表
     */
    List<Course> selectList(Course course);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int insert(Course course);
	
	/**
     * 批量新增
     *
     * @param courses 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(List<Course> courses);
	
    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 修改
     */
    Course update(Course course);

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