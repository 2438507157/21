package test;

import org.junit.Test;

import com.liuchengqiang.utils.StringUtil;

public class StringTest {
	
	@Test
	public void test(){
		String reg=StringUtil.toHtml("as\n阿萨德\r");
		System.out.println(reg);
	}
	//判断为空
	@Test
	public void test01() {
		boolean empty = StringUtil.isEmpty("   ");
		System.out.println(empty);
	}

	@Test
	public void test02() {
		boolean emptyAndSpace = StringUtil.isEmptyAndSpace("a   ");
		System.out.println(emptyAndSpace);
	}
	//手机号
	@Test
	public void test03() {
		boolean phoneNum = StringUtil.isPhoneNum("13922245678");
		System.out.println(phoneNum);
	}
	//邮箱
	@Test
	public  void  test04() {
		boolean email = StringUtil.isEmail("13922245678");
		System.out.println(email);
	}
	
	
}
