package com.ubs.opsit.interviews.data;

/**
 * Created by Slawek on 2015-11-16.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(String time) {
        String[] timeSplit = time.split(":");
        hours = parseInt(timeSplit[0]);
        minutes = parseInt(timeSplit[1]);
        seconds = parseInt(timeSplit[2]);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
