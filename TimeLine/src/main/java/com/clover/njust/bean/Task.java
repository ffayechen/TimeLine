package com.clover.njust.bean;

import java.util.Date;

/**
 * Created by lenovo-p on 2017/6/7.
 */

public class Task {
    private int id;                     //任务ID,主键
    private String title;               //任务名称
    private String createTimeStack;     //创建任务的时间戳
    private String startDate;           //任务开始的日期
    private String endDate;             //任务开始的日期
    private String startTime;           //开始时间
    private String endTime;             //结束时间
    private String classifier;          //分类
    private int priority;               //任务优先级
    private boolean isClock;            //是否使用闹钟
    private boolean isRepeatAlert;      //是否重复提醒
    private boolean isTop        ;      //是否置顶
    private String repeatType;          //重复类型
    private String address;             //地点
    private String pictureURI;          //照片地址
    private String taskType;            //任务类型：Clip,Task,Record
    private String remarks;             //备注

    public Task(String taskType, String title, int id) {
        this.taskType = taskType;
        this.title = title;
        this.id = id;
    }

    public Task(int id, String title, String createTimeStack,
                String startDate, String endDate, String startTime,
                String endTime, String classifier, int priority,
                boolean isClock, boolean isRepeatAlert, boolean isTop,
                String repeatType, String address, String pictureURI,
                String taskType, String remarks) {
        this.id = id;
        this.title = title;
        this.createTimeStack = createTimeStack;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classifier = classifier;
        this.priority = priority;
        this.isClock = isClock;
        this.isRepeatAlert = isRepeatAlert;
        this.isTop = isTop;
        this.repeatType = repeatType;
        this.address = address;
        this.pictureURI = pictureURI;
        this.taskType = taskType;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateTimeStack() {
        return createTimeStack;
    }

    public void setCreateTimeStack(String createTimeStack) {
        this.createTimeStack = createTimeStack;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isClock() {
        return isClock;
    }

    public void setClock(boolean clock) {
        isClock = clock;
    }

    public boolean isRepeatAlert() {
        return isRepeatAlert;
    }

    public void setRepeatAlert(boolean repeatAlert) {
        isRepeatAlert = repeatAlert;
    }

    public boolean isTop() {
        return isTop;
    }

    public void setTop(boolean top) {
        isTop = top;
    }

    public String getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(String repeatType) {
        this.repeatType = repeatType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPictureURI() {
        return pictureURI;
    }

    public void setPictureURI(String pictureURI) {
        this.pictureURI = pictureURI;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
