package com.pzy.study.C22原型模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class EventTemplate {

    private String subject;
    private String content;

    public EventTemplate(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public EventTemplate(){}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
