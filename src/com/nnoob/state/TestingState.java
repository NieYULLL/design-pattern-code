package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:13
 * @description:
 */
public class TestingState implements State{

    private boolean testResult;

    public boolean isTestResult() {
        return testResult;
    }

    public void setTestResult(boolean testResult) {
        this.testResult = testResult;
    }

    public TestingState() {
    }

    public TestingState(boolean testResult) {
        this.testResult = testResult;
    }

    @Override
    public void handle(StoryTask storyTask) {
        System.err.println("状态改变->测试完成");
        if (storyTask.getAllow()){
            TestPassState testPassState = new TestPassState(testResult);
            storyTask.setState(testPassState);
        }
    }
}
