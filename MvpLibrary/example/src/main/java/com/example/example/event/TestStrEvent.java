package com.example.example.event;

import com.example.example.app.Constants;
import com.stone.baselib.busevent.SEvent;

/**
 * Stone
 * 2019/4/9
 * 不同业务可编写不同Event实例类，也可用eventType来区分不同业务
 **/
public class TestStrEvent implements SEvent {
    private int eventType = Constants.EVENT_TEST_STR;
    private String msg;
    private Object xx;

    @Override
    public int getEventType() {
        return eventType;
    }

    @Override
    public TestStrEvent setEventType(int eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public SEvent setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
