package com.dmdev.oop.practice;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = createTimeInterval();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.TotalSeconds());
        System.out.println(timeInterval2.TotalSeconds());

        timeInterval.print();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.print();
     }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30,2,1);
        System.out.println(timeInterval.TotalSeconds());
        return timeInterval;
    }
}
