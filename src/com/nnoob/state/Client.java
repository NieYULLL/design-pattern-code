package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:20
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        StoryTask storyTask = new StoryTask(new TodoState());


        storyTask.nextState();
        storyTask.nextState();
        storyTask.nextState();

        if (storyTask.getState() instanceof TestingState) {
            TestingState state = (TestingState)storyTask.getState();
            state.setTestResult(false);
            storyTask.nextState();

        }


        storyTask.nextState();
        storyTask.nextState();
        storyTask.nextState();
        if (storyTask.getState() instanceof TestingState) {
            TestingState state = (TestingState)storyTask.getState();
            state.setTestResult(true);
            storyTask.nextState();

        }
        storyTask.nextState();


    }
}
