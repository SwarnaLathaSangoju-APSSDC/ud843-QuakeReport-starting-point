package com.example.android.quakereport;

/**
 * Created by sango on 17-10-2016.
 */

public class EarthQuake {
    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

public String getMurl(){ return murl;}
    public String getmDate() {
        return mDate;
    }

    private double mMagnitude;
    private String mLocation;
    private String mDate;
private String murl;
    public EarthQuake(double magnitude,String location,String date,String url){
        mMagnitude=magnitude;
        mLocation=location;
murl=url;
        mDate=date;
    }

}
