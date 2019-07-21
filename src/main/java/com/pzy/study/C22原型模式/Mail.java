package com.pzy.study.C22原型模式;

import java.util.ArrayList;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class Mail implements Cloneable {

    private String receiver;
    private String subject;
    private String content;
    private String tail;
    private ArrayList<String> ars;


    public Mail(EventTemplate et){
        this.subject = et.getSubject();
        this.content = et.getContent();
    }


    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

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

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public ArrayList<String> getArs() {
        return ars;
    }

    public void setArs(ArrayList<String> ars) {
        this.ars = ars;
    }

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
            //对ArrayList对象重新拷贝一份(深拷贝)
            mail.ars = (ArrayList<String>)this.ars.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
