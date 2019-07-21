package com.pzy.study.C22原型模式;

import java.util.Random;

/**
 * Destription: 银行电子账单发邮件问题
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class ProtoTypeTest {


    public static void main(String[] args) {
        int i = 0;
        int MAX_COUNT = 10;
        EventTemplate et = new EventTemplate("9月份信用卡账单" , "国庆抽奖活动。。。");
        Mail  mail = new Mail(et);
        while (i < MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setTail("13871577815" + new Random().nextInt(5));
            cloneMail.setReceiver("陈女士" + new Random().nextInt(5));
            sendMail(cloneMail);
            ++i;
        }
    }

    private static void sendMail(Mail cloneMail) {
        System.out.println(cloneMail.toString());
    }


    /**
     * 原型模式：通过复制现有实例来创建新的实例，无须知道相应类的信息
     * 优点：
     * 1、比直接new一个对象更有效
     * 2、隐藏制造新实例的复杂性
     * 3、重复地创建相似的对象时可以考虑使用原型模式
     * 缺点：
     *  1、每一个类必须配备一个克隆方法
     *  2、深层复制比较复杂
     *  注意事项：
     *  1、使用原型模式复制对象不会调用类的构造方法。所以，单例模式与原型模式是冲突的，在使用时要特别注意
     *  2、Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象都不会拷贝，
     *  如果要实现深拷贝，必须将原型模式中的数组、容器对象，引用对象等另行拷贝。
     */
}
