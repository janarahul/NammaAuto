package com.example.rahulj.nammaauto;

import com.google.android.gms.maps.model.LatLng;


import java.util.List;
/**
 * Created by rahulj on 30/9/16.
 */
public class Route {

    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
