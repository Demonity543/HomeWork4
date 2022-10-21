package Task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {

        LocalDate dat = LocalDate.of(2020, 12, 10);
        LocalDate dat2 = LocalDate.of(2022, 12, 10);
        LocalDate date = LocalDate.of(1969, 7, 20);

        Year year1 = year -> {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        };
        Days day = (date1, date2) -> {
            return date2.until(date1, ChronoUnit.DAYS);
        };
        Weeks weeks = (date1, date2) -> {
            return date2.until(date1, ChronoUnit.WEEKS);
        };
        Day dayofWeek = (date3) -> {
            return date3.getDayOfWeek().toString();
        };

        System.out.println("\nYear is leap: " + year1.leapYear(2020));
        System.out.println("\nDays: " + day.daysBetween(dat2, dat));
        System.out.println("\nWeeks: " + weeks.weeksBetween(dat2, dat));
        System.out.println("\nDay: " + dayofWeek.getDay(date));

    }

}
