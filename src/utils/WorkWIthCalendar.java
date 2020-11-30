package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class WorkWIthCalendar {
    public static void main(String[] args) {
        WorkWIthCalendar workWIthCalendar = new WorkWIthCalendar();
        workWIthCalendar.dateTime();
    }

    public void dateTime() {
        LocalDate localDate = LocalDate.now();
        localDate = LocalDate.of(1,1,1);
        LocalTime localTime = LocalTime.of(23, 59);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        LocalDate tomorrow = localDate.plusDays(1);
        boolean b = localTime.isAfter(localTime.minusHours(1));

        System.out.println(
                localDateTime.format(
                        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
                )
        );
    }

    public void constructors() {
        Calendar calendar1 = new GregorianCalendar(2014, Calendar.APRIL, 15, 16, 48, 32);
        Calendar calendar2 = new GregorianCalendar(1937, Calendar.SEPTEMBER, 6, 2, 13);
        Calendar calendar3 = new GregorianCalendar(3020, Calendar.MARCH, 30);
        System.out.println(calendar1.getTime());
        System.out.println(calendar2.getTime());
        System.out.println(calendar3.getTime());
    }

    public void example1() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_YEAR, -10);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        System.out.println("Дата начала дня 10 дней назад");
        System.out.println(calendar.getTime());

    }
}
