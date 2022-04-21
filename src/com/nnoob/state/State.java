package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:06
 * @description: 任务故事状态改变统一接口
 */
public interface State {


    void  handle(StoryTask storyTask);
}
