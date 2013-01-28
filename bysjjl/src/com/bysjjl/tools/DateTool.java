package com.bysjjl.tools;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {

	/**
	 * 将日期时间字符串(yyyy-MM-dd HH:mm:ss)
	 * 
	 * @return
	 */
	public static String dateTime2String(Date date) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			return formatter.format(date);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 将日期时间字符串(yyyy-MM-dd HH:mm:ss)
	 * 
	 * @return
	 */
	public static Timestamp dateTime2formatDate(Date date) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			Timestamp ts = new Timestamp(formatter.parse(date.toString())
					.getTime());
			return ts;
		} catch (Exception e) {
			return null;
		}
	}
}
