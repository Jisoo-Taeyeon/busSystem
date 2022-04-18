package com.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CourseLesson)实体类  课时信息表
 *
 * @author makejava
 * @since 2022-04-14 13:47:03
 */
public class CourseLesson implements Serializable {
    private static final long serialVersionUID = -61265678063222321L;
    /**
    * id
    */
    private Object id;
    /**
    * 课程id
    */
    private Integer courseId;
    /**
    * 章节id
    */
    private Integer sectionId;
    /**
    * 课时主题
    */
    private String theme;
    /**
    * 课时时长(分钟)
    */
    private Integer duration;
    /**
    * 是否免费
    */
    private Object isFree;
    /**
    * 课时背景图
    */
    private String startImgUrl;
    /**
    * 课时内容
    */
    private Object textContent;
    /**
    * 课时内容（markdown文本）
    */
    private Object markdownTextContent;
    /**
    * 转码集合
    */
    private String transcode;
    /**
    * 课程资源路径
    */
    private String resourceUrl;
    /**
    * 最后操作者id
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
    * 是否删除
    */
    private Object isDel;
    /**
    * 排序字段
    */
    private Integer orderNum;
    /**
    * 阿里云视频文件URL
    */
    private String aliFileUrl;
    /**
    * 阿里云视频文件的DK
    */
    private String aliFileDk;
    /**
    * 阿里云视频文件的EDK
    */
    private String aliFileEdk;
    /**
    * 阿里云视频资源文件ID
    */
    private String aliFileVid;
    /**
    * 课时状态,0-隐藏，1-未发布，2-已发布
    */
    private Integer status;
    /**
    * 是否定时发布
    */
    private Object isTimingPublish;
    /**
    * 定时发布时间
    */
    private Date publishTime;

        
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
        
    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }
        
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
        
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
        
    public Object getIsFree() {
        return isFree;
    }

    public void setIsFree(Object isFree) {
        this.isFree = isFree;
    }
        
    public String getStartImgUrl() {
        return startImgUrl;
    }

    public void setStartImgUrl(String startImgUrl) {
        this.startImgUrl = startImgUrl;
    }
        
    public Object getTextContent() {
        return textContent;
    }

    public void setTextContent(Object textContent) {
        this.textContent = textContent;
    }
        
    public Object getMarkdownTextContent() {
        return markdownTextContent;
    }

    public void setMarkdownTextContent(Object markdownTextContent) {
        this.markdownTextContent = markdownTextContent;
    }
        
    public String getTranscode() {
        return transcode;
    }

    public void setTranscode(String transcode) {
        this.transcode = transcode;
    }
        
    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
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
        
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
        
    public String getAliFileUrl() {
        return aliFileUrl;
    }

    public void setAliFileUrl(String aliFileUrl) {
        this.aliFileUrl = aliFileUrl;
    }
        
    public String getAliFileDk() {
        return aliFileDk;
    }

    public void setAliFileDk(String aliFileDk) {
        this.aliFileDk = aliFileDk;
    }
        
    public String getAliFileEdk() {
        return aliFileEdk;
    }

    public void setAliFileEdk(String aliFileEdk) {
        this.aliFileEdk = aliFileEdk;
    }
        
    public String getAliFileVid() {
        return aliFileVid;
    }

    public void setAliFileVid(String aliFileVid) {
        this.aliFileVid = aliFileVid;
    }
        
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
        
    public Object getIsTimingPublish() {
        return isTimingPublish;
    }

    public void setIsTimingPublish(Object isTimingPublish) {
        this.isTimingPublish = isTimingPublish;
    }
        
    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString(){
        return "CourseLesson {" +
            "id : " + id + ", " +
            "courseId : " + courseId + ", " +
            "sectionId : " + sectionId + ", " +
            "theme : " + theme + ", " +
            "duration : " + duration + ", " +
            "isFree : " + isFree + ", " +
            "startImgUrl : " + startImgUrl + ", " +
            "textContent : " + textContent + ", " +
            "markdownTextContent : " + markdownTextContent + ", " +
            "transcode : " + transcode + ", " +
            "resourceUrl : " + resourceUrl + ", " +
            "lastOperatorId : " + lastOperatorId + ", " +
            "createTime : " + createTime + ", " +
            "updateTime : " + updateTime + ", " +
            "isDel : " + isDel + ", " +
            "orderNum : " + orderNum + ", " +
            "aliFileUrl : " + aliFileUrl + ", " +
            "aliFileDk : " + aliFileDk + ", " +
            "aliFileEdk : " + aliFileEdk + ", " +
            "aliFileVid : " + aliFileVid + ", " +
            "status : " + status + ", " +
            "isTimingPublish : " + isTimingPublish + ", " +
            "publishTime : " + publishTime + ", " +
        '}';
    }
}