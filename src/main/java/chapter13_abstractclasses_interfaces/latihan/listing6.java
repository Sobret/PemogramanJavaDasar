package chapter13_abstractclasses_interfaces.latihan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class listing6 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("current time is " + new Date());
        System.out.println("year: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " +
                calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " +
                calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " +
                calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " +
                calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " +
                calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " +
                calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));

        Calendar calendar1 = new GregorianCalendar(1997, 11, 25);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        System.out.println("December 25, 1997 is a " +
                dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
