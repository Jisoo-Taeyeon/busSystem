package com.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CourseMedia)实体类  课程媒体表
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public class CourseMedia implements Serializable {
    private static final long serialVersionUID = 521254252703338075L;
    /**
    * 课程媒体主键ID
    */
    private Integer id;
    /**
    * 课程Id
    */
    private Integer courseId;
    /**
    * 章ID
    */
    private Integer sectionId;
    /**
    * 课时ID
    */
    private Integer lessonId;
    /**
    * 媒体渠道，1-阿里云
    */
    private Integer channel;
    /**
    * 媒体类型，0-音频，1-视频
    */
    private Integer mediaType;
    /**
    * 封面图URL
    */
    private String coverImageUrl;
    /**
    * 时长（06:02）
    */
    private String duration;
    /**
    * 媒体资源文件ID
    */
    private String fileId;
    /**
    * 媒体文件URL,目前只有音频使用
    */
    private String fileUrl;
    /**
    * 媒体资源文件对应的EDK
    */
    private String fileEdk;
    /**
    * 文件大小MB
    */
    private Object fileSize;
    /**
    * 文件名称
    */
    private String fileName;
    /**
    * 媒体资源文件对应的DK
    */
    private String fileDk;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 媒体状态
    */
    private Integer status;
    /**
    * 是否删除，0未删除，1删除
    */
    private Object isDel;
    /**
    * 最后操作者ID
    */
    private Integer lastOperatorId;
    /**
    * 时长，秒数（主要用于音频在H5控件中使用）
    */
    private Integer durationNum;

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        
    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }
        
    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }
        
    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }
        
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }
        
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
        
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
        
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
        
    public String getFileEdk() {
        return fileEdk;
    }

    public void setFileEdk(String fileEdk) {
        this.fileEdk = fileEdk;
    }
        
    public Object getFileSize() {
        return fileSize;
    }

    public void setFileSize(Object fileSize) {
        this.fileSize = fileSize;
    }
        
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
        
    public String getFileDk() {
        return fileDk;
    }

    public void setFileDk(String fileDk) {
        this.fileDk = fileDk;
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
        
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
        
    public Object getIsDel() {
        return isDel;
    }

    public void setIsDel(Object isDel) {
        this.isDel = isDel;
    }
        
    public Integer getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }
        
    public Integer getDurationNum() {
        return durationNum;
    }

    public void setDurationNum(Integer durationNum) {
        this.durationNum = durationNum;
    }

    @Override
    public String toString(){
        return "CourseMedia {" +
            "id : " + id + ", " +
            "courseId : " + courseId + ", " +
            "sectionId : " + sectionId + ", " +
            "lessonId : " + lessonId + ", " +
            "channel : " + channel + ", " +
            "mediaType : " + mediaType + ", " +
            "coverImageUrl : " + coverImageUrl + ", " +
            "duration : " + duration + ", " +
            "fileId : " + fileId + ", " +
            "fileUrl : " + fileUrl + ", " +
            "fileEdk : " + fileEdk + ", " +
            "fileSize : " + fileSize + ", " +
            "fileName : " + fileName + ", " +
            "fileDk : " + fileDk + ", " +
            "createTime : " + createTime + ", " +
            "updateTime : " + updateTime + ", " +
            "status : " + status + ", " +
            "isDel : " + isDel + ", " +
            "lastOperatorId : " + lastOperatorId + ", " +
            "durationNum : " + durationNum + ", " +
        '}';
    }
}