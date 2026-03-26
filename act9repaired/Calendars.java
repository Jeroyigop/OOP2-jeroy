package activity9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendars {

    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java Exercise13_04 <month> <year>");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        String monthName = getMonthName(month);
        System.out.println("         " + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%4d", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        
        System.out.println();
    }

    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
}