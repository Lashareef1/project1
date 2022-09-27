package com.infinite.day2;

enum WeekDays {
	SUNDAY,MONDAY,TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,STAURDAY
}
public class Enumx1 {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.THURSDAY;
		System.out.println(wd);
		String str = "FRIDAY";
		wd = WeekDays.valueOf(str);
		System.out.println(wd);

	}

}
