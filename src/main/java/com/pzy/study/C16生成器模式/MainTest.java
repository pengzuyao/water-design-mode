package com.pzy.study.C16生成器模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class MainTest {

    public static void main(String[] args) {
        BuilderSelf builder = new BuilderSelf("2019-7-20");
        Vacation build = builder.addDay().build();
    }
}
