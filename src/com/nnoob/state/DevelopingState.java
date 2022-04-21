package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:13
 * @description:
 */
public class DevelopingState implements State{
    @Override
    public void handle(StoryTask storyTask) {
        System.err.println("状态改变->开发完成");
        storyTask.setState(new DevelopFinishState());
    }
}
