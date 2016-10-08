package com.cefalo.dp.course;

/**
 * Created by shimul on 10/9/16.
 */
public class StandardState implements State {
    @Override
    public void updateState(User user, boolean isUpgrade) {

        if(isUpgrade){
            //do nothing
            System.out.println("You have the highest subscription. No upgrades available!");
        }else{
            user.setCurrentState(new TrialState());
        }
    }

    @Override
    public String toString() {
        return "Standard User";
    }
}
