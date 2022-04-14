package com.lihu.service;

import com.lihu.entity.CourseSection;
import java.util.List;
import java.util.Map;

/**
 * (CourseSection)表服务接口
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public interface CourseSectionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseSection selectById(Object id);

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseSection> selectPage(int start, int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<CourseSection> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseSection 实例对象
     * @return 对象列表
     */
    List<CourseSection> selectList(CourseSection courseSection);

    /**
     * 新增数据
     *
     * @param courseSection 实例对象
     * @return 影响行数
     */
    int insert(CourseSection courseSection);
	
	/**
     * 批量新增
     *
     * @param courseSections 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(List<CourseSection> courseSections);
	
    /**
     * 修改数据
     *
     * @param courseSection 实例对象
     * @return 修改
     */
    CourseSection update(CourseSection courseSection);

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