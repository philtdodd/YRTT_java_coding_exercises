package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Exercise004 {
    private static LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime = LocalDateTime.of(date, LocalTime.of(0,0,0,0));
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds((long)Math.pow(10, 9));
    }
}
