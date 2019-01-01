package com.btc.microservice.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description TODO
 *              </ul>
 * @className DateTimeUtils
 * @package com.btc.microservice.common.utils
 * @createdTime 2016年10月30日 下午10:17:40
 *
 * @version V1.0.0
 */
public class DateTimeUtils
{

	/**
	 * 
	 */
	private static final String YYYY_MM_DD = "yyyy-MM-dd";
	/**
	 * 
	 */
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * 
	 */
	public static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	/**
	 * 
	 */
	public static final SimpleDateFormat HH_TIME_FORMAT = new SimpleDateFormat("hh:mm:ss");
	/**
	 * 
	 */
	public static final int DAYS_OF_ONE_WEEK = 7;

	/**
	 * 
	 */
	/**
	 * 
	 * @author HuaZai
	 * @contact who.seek.me@java98k.vip
	 * @title getEndOfDay
	 *        <ul>
	 * @description
	 *              <li>获得某天最大时间 yyyy-MM-dd 23:59:59
	 *              </ul>
	 * @createdTime 2016年10月30日 下午10:18:19
	 * @param date
	 * @return
	 * @return String
	 *
	 * @version : V1.0.0
	 */
	public static String getEndOfDay(Date date)
	{
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()),
				ZoneId.systemDefault());
		LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
		Date from = Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDete = format.format(from);
		return strDete;
	}

	/**
	 * 
	 * @author HuaZai
	 * @contact who.seek.me@java98k.vip
	 * @title getWhicthDay
	 *        <ul>
	 * @description
	 *              <li>查当前日期是一周中的第几天、星期几
	 *              </ul>
	 * @createdTime 2018年12月30日 下午10:20:14
	 * @param today
	 * @return
	 * @return long
	 *
	 * @version : V1.0.0
	 */
	public static long getWhicthDay(Date today)
	{

		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		// 1=Sunday,2=Monday,,,7=Saturday。
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * 计算距离baseDate 若干天的 日期 days=2 表示2天后 days=-1 一天前
	 *
	 * @param baseDate
	 *            日期 null 表示当前日期
	 * @param days
	 *            日期
	 */
	public static Date daysBetweenWeeks(Date baseDate, int days)
	{
		Calendar c = Calendar.getInstance();
		if (baseDate != null)
		{
			c.setTime(baseDate);
		}

		c.add(Calendar.DAY_OF_MONTH, days);
		return c.getTime();
	}

	public static java.sql.Date fromUtilDate(Date utilDate)
	{
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}

	public static Date lastMonday()
	{
		Date _7daysBefore = daysBetweenWeeks(null, -DAYS_OF_ONE_WEEK);
		return mondayOfThisWeek(_7daysBefore);
	}

	public static Date lastSunday()
	{
		Date _7daysBefore = daysBetweenWeeks(null, -DAYS_OF_ONE_WEEK);
		return sundayOfThisWeek(_7daysBefore);
	}

	/**
	 * 获取某个日期对应的 日期 的周一
	 *
	 * @param theDate
	 *            某个日期 null的话，表示当前日期
	 * @return Date
	 */
	public static Date mondayOfThisWeek(Date theDate)
	{
		Calendar c = Calendar.getInstance();
		if (theDate != null)
		{
			c.setTime(theDate);
		}
		// 获取 周一
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return c.getTime();
	}

	/**
	 * 获取某个日期对应的 日期 的周日
	 *
	 * @param theDate
	 *            某个日期 null的话，表示当前日期 获取当前日期的周7,注意 日历获取的周期是 周日,1,2,3,4,5,6 不是中国传统的
	 *            1,2,3,4,5,6,周日 所以要加7
	 * @return Date
	 */
	public static Date sundayOfThisWeek(Date theDate)
	{
		Calendar c = Calendar.getInstance();
		if (theDate != null)
		{
			c.setTime(theDate);
		}
		// 获取 周日
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		// 获取 中国意义上的 周日
		c.add(Calendar.DAY_OF_MONTH, 7);
		return c.getTime();
	}

	/**
	 * 获取某个日期对应的 日期 的周日
	 *
	 * @param theDate
	 *            某个日期 null的话，表示当前日期 获取当前日期的周7,注意 日历获取的周期是 周日,1,2,3,4,5,6 不是中国传统的
	 *            1,2,3,4,5,6,周日 所以要加7
	 * @return Date
	 */
	public static Date getSundayOfThisWeek(Date theDate)
	{
		Calendar c = Calendar.getInstance();
		if (theDate != null)
		{
			c.setTime(theDate);
		}
		// 获取 周日
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		// 获取 中国意义上的 周日
		c.add(Calendar.DAY_OF_MONTH, 7);
		if (getWhicthDay(theDate) == 1)
		{
			c.add(Calendar.DATE, c.getFirstDayOfWeek() - 8);
		}
		return c.getTime();
	}

	/**
	 * 字符串转换为日期类型
	 */
	public static Date stringToDate(String dateString)
	{

		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD);
			return sdf.parse(dateString);
		} catch (ParseException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static String dateToString(Date date)
	{
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD);
			return sdf.format(date);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return date.toString();
	}

	/**
	 * YYYY:MM:DD hh:mm:ss --->YYYY:MM:DD
	 */
	public static Date timeToDate(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD);
		String s = sdf.format(date);
		try
		{
			return sdf.parse(s);
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取某天当前周的周一
	 */
	public static Date getThisWeekMonday(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// 获得当前日期是一个星期的第几天
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (1 == dayWeek)
		{
			cal.add(Calendar.DAY_OF_MONTH, -1);
		}
		// 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		// 获得当前日期是一个星期的第几天
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 根据日历的规则，当前日期减去 星期几与一个星期第一天的差值 即可计算当前周期第一天
		cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
		return cal.getTime();
	}

	/**
	 * 获取某天上周一的日期
	 */
	public static Date geLastWeekMonday(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(getThisWeekMonday(date));
		cal.add(Calendar.DATE, -7);
		return cal.getTime();
	}

	/**
	 * 获取某天下周一的日期
	 */
	public static Date getNextWeekMonday(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(getThisWeekMonday(date));
		cal.add(Calendar.DATE, 7);
		return cal.getTime();
	}

	/**
	 * 获取某天的前后几天的日期
	 *
	 * @param day
	 *            :正数表示后几天,负数表示前几天
	 */
	public static Date addDay(Date date, int day)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, day);
		return cal.getTime();
	}

	/**
	 * 添加时间
	 *
	 * @param time
	 *            hh:mm:ss
	 */
	public static Date addTime(Date date, String time)
	{
		if (StringUtils.isEmpty(time))
		{
			return date;
		}
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		// eg:["01","00","00"]
		String[] times = time.split(":");
		int[] timeUnit =
		{ Calendar.HOUR, Calendar.MINUTE, Calendar.SECOND };
		if (date != null)
		{
			for (int i = 0; i < times.length; i++)
			{
				cd.add(timeUnit[i], Integer.valueOf(times[i]));
			}
		}
		return cd.getTime();
	}

	/**
	 * 获取初始化日期格式化
	 *
	 * @param day
	 *            :获取初始化日期格式化
	 */
	public static Date dateFormatDate(Date date)
	{
		Date parse = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
			String strDate = format.format(date);
			parse = format.parse(strDate);
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
		return parse;
	}

}
