package m2d192;

import java.util.Properties;

/**
 * Properties被称为属性类对象，是一个Map集合，继承Hashtable
 * Properties的key和value是String类型
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		
		pro.setProperty("12345", "123");
		String s=pro.getProperty("12345");
		System.out.println(s);
	}

}
