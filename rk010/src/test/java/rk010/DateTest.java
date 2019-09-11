package rk010;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.hq.util.DateUtil;

public class DateTest {
	
	@Test
	public void test01() throws ParseException{
		Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2001-09-06");
		// 日期对象
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parse);
		int age = DateUtil.getAge(calendar);
		System.out.println(age);
	
	}
	
	@Test
	public void test02() throws ParseException{
		Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-06");
		// 日期对象
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parse);
		int age = DateUtil.getFutrueDays(calendar);
		System.out.println(age);
	}
	
	@Test
	public void test03() throws ParseException{
		Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-9-10");
		// 日期对象
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parse);
		int age = DateUtil.getPastDays(calendar);
		System.out.println(age);
	}
	
	
		
	

}
