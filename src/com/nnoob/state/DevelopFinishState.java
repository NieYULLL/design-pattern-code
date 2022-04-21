package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:13
 * @description:
 */
public class DevelopFinishState implements State{
    @Override
    public void handle(StoryTask storyTask) {
        System.err.println("状态改变->测试中");
        storyTask.setState(new TestingState());
    }
}
