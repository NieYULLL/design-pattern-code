package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:16
 * @description:
 */
public class TPMPassState implements State{
    @Override
    public void handle(StoryTask storyTask) {
        System.err.println("该故事已完成");
    }
}
