package Arraybasic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		String s = "18/11/2021";
		SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyy");
		Date d1 = Format.parse(s);
		System.out.println(d1);
	}
}
