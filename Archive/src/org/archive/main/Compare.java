package org.archive.main;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Compare {
	private Compare() {}

	// email
	// ^\w+@(google\.com|naver\.com)$
	// ^\w+@\w+\.[\w\.]+$
	
	private static Pattern patternRegist = 
			Pattern.compile("^(\\d{2})(\\d{2})(\\d{2})-(\\d)\\d{6}$");
	
	public static Date RegistToDate(String data) {
		Matcher matcher = patternRegist.matcher(data);
		if(matcher.find()) {
			int gender = Integer.parseInt(matcher.group(4));
			int year = (gender == 3 || gender == 4 || gender == 7 || gender == 8? 2000 : 1900) +
					Integer.parseInt(matcher.group(1));
			int month = Integer.parseInt(matcher.group(2));
			int day = Integer.parseInt(matcher.group(3));
			if(month > 12) return null;
			if(day > 31) return null;
			
			return new Date(year, month - 1, day);
		}
		else return null;
	}
	
	public static boolean isRegist(String data) {
		return data.matches("^\\d{6}-\\d{7}$");
	}
	public static boolean isPhone(String data) {
		return data.matches("^(\\+\\d{2,3})?\\d{2,3}-\\d{3,4}-\\d{4}$");
	}
}
