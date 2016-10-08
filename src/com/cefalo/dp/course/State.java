package com.cefalo.dp.course;

/**
 * Created by shimul on 10/9/16.
 */
public interface State {

    void updateState(User user, boolean isUpgrade);
}
