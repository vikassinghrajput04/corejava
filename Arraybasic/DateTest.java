package Arraybasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();

		SimpleDateFormat s5 = new SimpleDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa");
		String str=s5.format(d);

		System.out.println(str);

	}

}
