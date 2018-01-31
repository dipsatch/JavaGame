package com.redomar.game.lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {

	public Time() {

	}

	public synchronized String getTime() {
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return (sdf.format(cal.getTime()));
	}

	public synchronized String getTimeDate() {
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("E dd MMM Y HH:mm:ss");
		return (sdf.format(cal.getTime()));
	}
}
