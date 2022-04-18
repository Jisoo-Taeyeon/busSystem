package com.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Course)实体类 课程表
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public class Course implements Serializable {
    private static final long serialVersionUID = -52614365430966340L;
    /**
    * id
    */
    private Object id;
    /**
    * 课程名
    */
    private String courseName;
    /**
    * 课程一句话简介
    */
    private String brief;
    /**
    * 讲师名称
    */
    private String teacherName;
    /**
    * 讲师介绍
    */
    private String teacherInfo;
    /**
    * 课时数
    */
    private Integer totalCourseTime;
    /**
    * 显示销量
    */
    private Integer sales;
    /**
    * 真实销量
    */
    private Integer actualSales;
    /**
    * 原价
    */
    private Object price;
    /**
    * 原价标签
    */
    private String priceTag;
    /**
    * 优惠价
    */
    private Object discounts;
    /**
    * 课程描述
    */
    private Object courseDescription;
    /**
    * 课程分享图片url
    */
    private String courseImgUrl;
    /**
    * 是否新品
    */
    private Object isNew;
    /**
    * 广告语
    */
    private String isNewDes;
    /**
    * 最后操作者
    */
    private Integer lastOperatorId;
    /**
    * 记录创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 是否删除,0未删除，1删除
    */
    private Object isDel;
    /**
    * 总时长(分钟)
    */
    private Integer totalDuration;
    /**
    * 分享title
    */
    private String shareTitle;
    /**
    * 分享描述
    */
    private String shareDescription;
    /**
    * 分享图title
    */
    private String shareImageTitle;
    /**
    * 课程状态，0-草稿，1-上架
    */
    private Integer status;
    /**
    * 课程排序，用于后台保存草稿时用到
    */
    private Integer sortNum;
    /**
    * 课程类型: 1 音视频课 2 伴读课
    */
    private Object courseType;
    /**
    * 最后课程最近通知时间
    */
    private Date lastNoticeTime;
    /**
    * 课程预览第一个字段
    */
    private String previewFirstField;
    /**
    * 课程预览第二个字段
    */
    private String previewSecondField;
    /**
    * 是否是灰度课程
    */
    private Object isGray;
    /**
    * 0 初级 1 初中级 2 中级 3 中高级 4 高级
    */
    private Object grade;

        
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }
        
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
        
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
        
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
        
    public String getTeacherInfo() {
        return teacherInfo;
    }

    public void setTeacherInfo(String teacherInfo) {
        this.teacherInfo = teacherInfo;
    }
        
    public Integer getTotalCourseTime() {
        return totalCourseTime;
    }

    public void setTotalCourseTime(Integer totalCourseTime) {
        this.totalCourseTime = totalCourseTime;
    }
        
    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
        
    public Integer getActualSales() {
        return actualSales;
    }

    public void setActualSales(Integer actualSales) {
        this.actualSales = actualSales;
    }
        
    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }
        
    public String getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(String priceTag) {
        this.priceTag = priceTag;
    }
        
    public Object getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Object discounts) {
        this.discounts = discounts;
    }
        
    public Object getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(Object courseDescription) {
        this.courseDescription = courseDescription;
    }
        
    public String getCourseImgUrl() {
        return courseImgUrl;
    }

    public void setCourseImgUrl(String courseImgUrl) {
        this.courseImgUrl = courseImgUrl;
    }
        
    public Object getIsNew() {
        return isNew;
    }

    public void setIsNew(Object isNew) {
        this.isNew = isNew;
    }
        
    public String getIsNewDes() {
        return isNewDes;
    }

    public void setIsNewDes(String isNewDes) {
        this.isNewDes = isNewDes;
    }
        
    public Integer getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
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
        
    public Object getIsDel() {
        return isDel;
    }

    public void setIsDel(Object isDel) {
        this.isDel = isDel;
    }
        
    public Integer getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }
        
    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }
        
    public String getShareDescription() {
        return shareDescription;
    }

    public void setShareDescription(String shareDescription) {
        this.shareDescription = shareDescription;
    }
        
    public String getShareImageTitle() {
        return shareImageTitle;
    }

    public void setShareImageTitle(String shareImageTitle) {
        this.shareImageTitle = shareImageTitle;
    }
        
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
        
    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
        
    public Object getCourseType() {
        return courseType;
    }

    public void setCourseType(Object courseType) {
        this.courseType = courseType;
    }
        
    public Date getLastNoticeTime() {
        return lastNoticeTime;
    }

    public void setLastNoticeTime(Date lastNoticeTime) {
        this.lastNoticeTime = lastNoticeTime;
    }
        
    public String getPreviewFirstField() {
        return previewFirstField;
    }

    public void setPreviewFirstField(String previewFirstField) {
        this.previewFirstField = previewFirstField;
    }
        
    public String getPreviewSecondField() {
        return previewSecondField;
    }

    public void setPreviewSecondField(String previewSecondField) {
        this.previewSecondField = previewSecondField;
    }
        
    public Object getIsGray() {
        return isGray;
    }

    public void setIsGray(Object isGray) {
        this.isGray = isGray;
    }
        
    public Object getGrade() {
        return grade;
    }

    public void setGrade(Object grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Course {" +
            "id : " + id + ", " +
            "courseName : " + courseName + ", " +
            "brief : " + brief + ", " +
            "teacherName : " + teacherName + ", " +
            "teacherInfo : " + teacherInfo + ", " +
            "totalCourseTime : " + totalCourseTime + ", " +
            "sales : " + sales + ", " +
            "actualSales : " + actualSales + ", " +
            "price : " + price + ", " +
            "priceTag : " + priceTag + ", " +
            "discounts : " + discounts + ", " +
            "courseDescription : " + courseDescription + ", " +
            "courseImgUrl : " + courseImgUrl + ", " +
            "isNew : " + isNew + ", " +
            "isNewDes : " + isNewDes + ", " +
            "lastOperatorId : " + lastOperatorId + ", " +
            "createTime : " + createTime + ", " +
            "updateTime : " + updateTime + ", " +
            "isDel : " + isDel + ", " +
            "totalDuration : " + totalDuration + ", " +
            "shareTitle : " + shareTitle + ", " +
            "shareDescription : " + shareDescription + ", " +
            "shareImageTitle : " + shareImageTitle + ", " +
            "status : " + status + ", " +
            "sortNum : " + sortNum + ", " +
            "courseType : " + courseType + ", " +
            "lastNoticeTime : " + lastNoticeTime + ", " +
            "previewFirstField : " + previewFirstField + ", " +
            "previewSecondField : " + previewSecondField + ", " +
            "isGray : " + isGray + ", " +
            "grade : " + grade + ", " +
        '}';
    }
}