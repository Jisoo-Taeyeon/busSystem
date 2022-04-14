package com.lihu.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CourseSection)实体类
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public class CourseSection implements Serializable {
    private static final long serialVersionUID = -79631667372418708L;
    /**
    * id
    */
    private Object id;
    /**
    * 课程id
    */
    private Integer courseId;
    /**
    * 章节名
    */
    private String sectionName;
    /**
    * 章节描述
    */
    private String description;
    /**
    * 最后操作者
    */
    private String lastOperator;
    /**
    * 记录创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 是否可见
    */
    private Object isVisible;
    /**
    * 是否删除 0-未删除，1-已删除
    */
    private Object isDel;
    /**
    * 排序字段
    */
    private Integer orderNum;
    /**
    * 最后操作者ID
    */
    private Integer lastOperatorId;
    /**
    * 状态，0:隐藏；1：待更新；2：已发布
    */
    private Integer status;

        
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }
        
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
        
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
        
    public Object getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Object isVisible) {
        this.isVisible = isVisible;
    }
        
    public Object getIsDel() {
        return isDel;
    }

    public void setIsDel(Object isDel) {
        this.isDel = isDel;
    }
        
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
        
    public Integer getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }
        
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "CourseSection {" +
            "id : " + id + ", " +
            "courseId : " + courseId + ", " +
            "sectionName : " + sectionName + ", " +
            "description : " + description + ", " +
            "lastOperator : " + lastOperator + ", " +
            "createTime : " + createTime + ", " +
            "updateTime : " + updateTime + ", " +
            "isVisible : " + isVisible + ", " +
            "isDel : " + isDel + ", " +
            "orderNum : " + orderNum + ", " +
            "lastOperatorId : " + lastOperatorId + ", " +
            "status : " + status + ", " +
        '}';
    }
}