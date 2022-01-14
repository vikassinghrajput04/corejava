package Arraybasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String str = format.format(d);
		System.out.println(str);
	}
}
