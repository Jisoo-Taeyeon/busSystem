package com.ssm.service;

import com.ssm.entity.CourseMedia;

import java.util.List;

/**
 * (CourseMedia)表服务接口
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public interface CourseMediaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseMedia selectById(Integer id);

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseMedia> selectPage(int start, int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<CourseMedia> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseMedia 实例对象
     * @return 对象列表
     */
    List<CourseMedia> selectList(CourseMedia courseMedia);

    /**
     * 新增数据
     *
     * @param courseMedia 实例对象
     * @return 影响行数
     */
    int insert(CourseMedia courseMedia);
	
	/**
     * 批量新增
     *
     * @param courseMedias 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(List<CourseMedia> courseMedias);
	
    /**
     * 修改数据
     *
     * @param courseMedia 实例对象
     * @return 修改
     */
    CourseMedia update(CourseMedia courseMedia);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}