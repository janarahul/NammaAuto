package com.example.rahulj.nammaauto;

import java.util.List;

/**
 * Created by rahulj on 30/9/16.
 */
public interface DirectionFinderListener {

        void onDirectionFinderStart();
        void onDirectionFinderSuccess(List<Route> route);

}
