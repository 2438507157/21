package com.liuchengqiang.utils;

// 完成字符串的工具类
public class StringUtil {
	
	//方法功能：将字符串转换成html文本，如果遇到“\n”换行换符，则要将这一段文本使用<p></p>标签
	//* 包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。

	public static String toHtml(String test){
		String reg_rondom1="\n";
		String reg_rondom2="\r";
		String reg_rondom3="\n\r";
		
		if (test.equals(reg_rondom1)) {
			test.compareTo("</p></p>");
		}
		if (test.equals(reg_rondom2)) {
			test.compareTo("</br>");
		}
		if (test.equals(reg_rondom3)) {
			test.compareTo("</n>");
		}
		return test;
	}
	
	
	//判断是否为手机号码
	public static boolean isPhoneNum(String phoneNum) {
		if(!isEmpty(phoneNum)) {
			return false;
		}
		//  验证是否为手机号 需要使用正则表达式
		String reg_phone="^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
		boolean matches = phoneNum.matches(reg_phone);
		return matches;


	}
	
	//判断是否为邮箱
	public static boolean isEmail(String email) {
		if(!isEmpty(email)) {
			return false;
		}
			//  验证是否为手机号 需要使用正则表达式
			String reg_email="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
			boolean matches = email.matches(reg_email);
			return matches;
	}
	
	
	//判断源字符串是否有值，空引号也算没值
		public static boolean isEmpty(String str) {
			return str!=null && !"".equals(str);
		}
		
		//	判断源字符串是否有值，空引号和空格也算没值
		public static boolean isEmptyAndSpace(String str) {
			return str!=null && !"".equals(str.trim());
		}
	
	
	
	
}
