package com.cefalo.dp.course;

/**
 * Created by shimul on 10/9/16.
 */
public class BaseState implements State {
    @Override
    public void updateState(User user, boolean isUpgrade) {
        if(isUpgrade){
            user.setCurrentState(new TrialState());
        }else{
            //do nothing
            System.out.println("No downgrade from Basic state");
        }
    }

    @Override
    public String toString() {
        return "Basic User";
    }
}
