package com.cefalo.dp.course;

/**
 * Created by shimul on 10/9/16.
 */
public class TrialState implements State {
    @Override
    public void updateState(User user, boolean isUpgrade) {

        if(isUpgrade){
            user.setCurrentState(new StandardState());
        }else{
            user.setCurrentState(new BaseState());
        }
    }

    @Override
    public String toString() {
        return "Trial User";
    }
}
