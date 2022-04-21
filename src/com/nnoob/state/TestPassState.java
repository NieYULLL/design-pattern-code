package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:13
 * @description:
 */
public class TestPassState implements State{


    private boolean testResult;

    public TestPassState(boolean testResult) {
        this.testResult = testResult;
    }

    public TestPassState() {
    }

    public boolean isTestResult() {
        return testResult;
    }

    public void setTestResult(boolean testResult) {
        this.testResult = testResult;
    }

    @Override
    public void handle(StoryTask storyTask) {
        if (testResult){
            System.err.println("状态改变->测试完成");
            storyTask.setState(new TPMPassState());
        }else {
            System.err.println("状态改变->开发中");
            storyTask.setState(new DevelopingState());

        }
    }
}
