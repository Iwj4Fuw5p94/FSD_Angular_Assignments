package com.deeps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeeg {

	public static void main(String[] args) {
		LocalDateTime ldt =	LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter mydate = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:MM:SS");
		System.out.println(ldt.format(mydate));
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		
		System.out.println(ldt.plus(7,ChronoUnit.DAYS));
		System.out.println(ldt.minus(2,ChronoUnit.DAYS));
		
		LocalDateTime  ldt2 = ldt.plus(7,ChronoUnit.DAYS);
		
		System.out.println(ChronoUnit.DAYS.between(ldt, ldt2));

	}

}
