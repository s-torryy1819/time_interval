package com.dmdev.oop.practice;

public class TimeInterval {
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds){
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public int TotalSeconds(){
        return seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_MINUTE * MINUTES_IN_HOUR;
    }
    public TimeInterval sum(TimeInterval second){
        return new TimeInterval(this.TotalSeconds()+second.TotalSeconds());
    }
    public void print(){
        System.out.println("Hours = "+hours+"\nMinutes = "+minutes+"\nSeconds = "+seconds);
    }
}
