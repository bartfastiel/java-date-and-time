package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

public class Main {
    public static void main(String[] args) {

        Instant balloonPopped = Instant.now();
        System.out.println(balloonPopped);

        ZonedDateTime balloonPopped2 = ZonedDateTime.now();
        System.out.println(balloonPopped2);

        LocalDateTime birthday = LocalDateTime.of(2010, 3, 5, 14, 0);
        System.out.println(birthday);

        String x = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(birthday);
        System.out.println(x);

        LocalDate y = LocalDate.parse("04.02.2010", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate z = y.minus(3, ChronoUnit.DAYS);
        System.out.println(z);
    }
}