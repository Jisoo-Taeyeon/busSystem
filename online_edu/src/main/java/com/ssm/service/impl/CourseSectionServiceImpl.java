package com.ssm.service.impl;

import com.ssm.dao.CourseSectionDao;
import com.ssm.entity.CourseSection;
import com.ssm.service.CourseSectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CourseSection表)服务实现类
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
@Service("courseSectionService")
public class CourseSectionServiceImpl implements CourseSectionService {
    @Resource
    private CourseSectionDao courseSectionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseSection selectById(Object id) {
        return this.courseSectionDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseSection> selectPage(int start, int limit) {
        return this.courseSectionDao.selectPage(start, limit);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
     @Override
     public List<CourseSection> selectAll() {
        return this.courseSectionDao.selectAll();
     }
     
    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<CourseSection> selectList(CourseSection courseSection) {
        return this.courseSectionDao.selectList(courseSection);
    }
    
    /**
     * 新增数据
     *
     * @param courseSection 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(CourseSection courseSection) {
        return this.courseSectionDao.insert(courseSection);
    }

    /**
     * 批量新增
     *
     * @param courseSections 实例对象的集合
     * @return 生效的条数
     */
    @Override
    public int batchInsert(List<CourseSection> courseSections) {
        return this.courseSectionDao.batchInsert(courseSections);
    }

    /**
     * 修改数据
     *
     * @param courseSection 实例对象
     * @return 实例对象
     */
    @Override
    public CourseSection update(CourseSection courseSection) {
        this.courseSectionDao.update(courseSection);
        return this.selectById(courseSection.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Object id) {
        return this.courseSectionDao.deleteById(id);
    }
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
     @Override
     public int count(){
        return this.courseSectionDao.count();
     }
}