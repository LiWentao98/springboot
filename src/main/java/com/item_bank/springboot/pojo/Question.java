package com.item_bank.springboot.pojo;

/*
试题类
 */

import java.util.Date;

public class Question {
    private int q_id;//试题唯一标识
    private String q_state;//试题状态
    private String q_content;//试题文本内容
    private String q_image_url;//试题相关图片目录
    private String q_type;//试题题型
    private String q_major;//所属专业
    private String q_subject;//所属科目
    private String chapter;//所属章节名
    private String difficulty;//难度
    private String knowledge;//考查的知识点
    private Date upload_time;//上传时间
    private int t_id;//所属教师id

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQ_state() {
        return q_state;
    }

    public void setQ_state(String q_state) {
        this.q_state = q_state;
    }

    public String getQ_content() {
        return q_content;
    }

    public void setQ_content(String q_content) {
        this.q_content = q_content;
    }

    public String getQ_image_url() {
        return q_image_url;
    }

    public void setQ_image_url(String q_image_url) {
        this.q_image_url = q_image_url;
    }

    public String getQ_type() {
        return q_type;
    }

    public void setQ_type(String q_type) {
        this.q_type = q_type;
    }

    public String getQ_major() {
        return q_major;
    }

    public void setQ_major(String q_major) {
        this.q_major = q_major;
    }

    public String getQ_subject() {
        return q_subject;
    }

    public void setQ_subject(String q_subject) {
        this.q_subject = q_subject;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public Date getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(Date upload_time) {
        this.upload_time = upload_time;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    @Override
    public String toString() {
        return "Question{" +
                "q_id=" + q_id +
                ", q_state='" + q_state + '\'' +
                ", q_content='" + q_content + '\'' +
                ", q_image_url='" + q_image_url + '\'' +
                ", q_type='" + q_type + '\'' +
                ", q_major='" + q_major + '\'' +
                ", q_subject='" + q_subject + '\'' +
                ", chapter='" + chapter + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", knowledge='" + knowledge + '\'' +
                ", upload_time=" + upload_time +
                ", t_id=" + t_id +
                '}';
    }
}
