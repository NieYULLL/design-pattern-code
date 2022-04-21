package com.nnoob.state;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 10:11
 * @description: jira故事基类
 */
public class StoryTask {
    public Boolean getAllow() {
        return allow;
    }

    public void setAllow(Boolean allow) {
        this.allow = allow;
    }

    /**
     * 待办、开发中、开发完成、测试中、测试通过、TPM已验收
     */
    private State state;

    private Boolean allow;


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public StoryTask() {
    }

    public StoryTask(State state) {
        this.state = state;
    }


    public void nextState(){
        state.handle(this);
    }





}
