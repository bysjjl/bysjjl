package com.bysjjl.tools;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {

	/**
	 * 时间转换为字符(yyyy-MM-dd HH:mm:ss)
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
	 * 时间格式转换为(yyyy-MM-dd HH:mm:ss)
	 * @return
	 */
	public static Timestamp string2formatDate(String dateTime) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd");
			Timestamp ts = new Timestamp(formatter.parse(dateTime).getTime());
			return ts;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * 时间格式转换为(yyyy-MM-dd HH:mm:ss)
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
	
	/**
     * 取得某个时间之前几天的时间
     * @param startTimestamp 开始时间
     * @param days 相隔天数
     * @return 结束时间
     */
    public Timestamp getTimestampBeforeDays(Timestamp startTimestamp, int days) {
        long endTimestampLong = startTimestamp.getTime() - ((long)days) * 24l * 60l * 60l * 1000l;
        Timestamp endTimestamp = new Timestamp(endTimestampLong);

        return endTimestamp;
    }
    
    /**
     * 取得某个时间之后几天的时间
     * @param startTimestamp 开始时间
     * @param days 相隔天数
     * @return 结束时间
     */
    public Timestamp getTimestampAfterDays(Timestamp startTimestamp, int days) {
        long endTimestampLong = startTimestamp.getTime() + ((long)days) * 24l * 60l * 60l * 1000l;
        Timestamp endTimestamp = new Timestamp(endTimestampLong);

        return endTimestamp;
    }
    
}
