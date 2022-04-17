package com.ssm.service.impl;

import com.ssm.dao.CourseMediaDao;
import com.ssm.entity.CourseMedia;
import com.ssm.service.CourseMediaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CourseMedia表)服务实现类
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
@Service("courseMediaService")
public class CourseMediaServiceImpl implements CourseMediaService {
    @Resource
    private CourseMediaDao courseMediaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseMedia selectById(Integer id) {
        return this.courseMediaDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseMedia> selectPage(int start, int limit) {
        return this.courseMediaDao.selectPage(start, limit);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
     @Override
     public List<CourseMedia> selectAll() {
        return this.courseMediaDao.selectAll();
     }
     
    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<CourseMedia> selectList(CourseMedia courseMedia) {
        return this.courseMediaDao.selectList(courseMedia);
    }
    
    /**
     * 新增数据
     *
     * @param courseMedia 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(CourseMedia courseMedia) {
        return this.courseMediaDao.insert(courseMedia);
    }

    /**
     * 批量新增
     *
     * @param courseMedias 实例对象的集合
     * @return 生效的条数
     */
    @Override
    public int batchInsert(List<CourseMedia> courseMedias) {
        return this.courseMediaDao.batchInsert(courseMedias);
    }

    /**
     * 修改数据
     *
     * @param courseMedia 实例对象
     * @return 实例对象
     */
    @Override
    public CourseMedia update(CourseMedia courseMedia) {
        this.courseMediaDao.update(courseMedia);
        return this.selectById(courseMedia.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.courseMediaDao.deleteById(id);
    }
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
     @Override
     public int count(){
        return this.courseMediaDao.count();
     }
}