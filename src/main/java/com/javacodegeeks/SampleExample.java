package com.javacodegeeks;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SampleExample {

    public static void main(String[] args) {
        /**
         * @param args the command line arguments
         */
        // TODO code application logic here
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Current date is  " + day + "/" + (month + 1) + "/" + year);
        System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
    }

    public int gettheday() {
        int day;
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        return (day);
    }

}
