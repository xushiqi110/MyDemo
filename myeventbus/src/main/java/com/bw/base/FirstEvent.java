package com.bw.base;

/**
 * autour: 徐仕奇
 * action：类的作用:这个类很简单，构造时传进去一个字符串，然后可以通过getMsg()获取出来。
 * date: 2016/12/12 0012 下午 4:56
 * update: 2016/12/12 0012
 */
public class FirstEvent {
    private String mMsg;
    public FirstEvent(String msg) {
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
