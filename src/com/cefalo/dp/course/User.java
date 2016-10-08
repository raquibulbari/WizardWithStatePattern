package com.cefalo.dp.course;

/**
 * Created by shimul on 10/9/16.
 */
public class User {

    State currentState;


    public User() {
        this.currentState = new BaseState();
    }

    void upgradeSub(){
        currentState.updateState(this, true);

    }

    void downgradeSub(){
        currentState.updateState(this, false);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void printStatus(){
        System.out.println("You are currently a : "+currentState.toString());
    }
}
