package java.arun.problemsolving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfProgrammer {
	public static void main(String[] args) throws ParseException {
		int year = 1984;
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DAY_OF_YEAR, 256);
		
		SimpleDateFormat sdf = new SimpleDateFormat("mm:dd:yyyy");
		System.out.println(sdf.format(cal.getTime()));
	}
}
