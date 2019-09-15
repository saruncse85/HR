package arun.problemsolving;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MilitaryTimeConversion {

	public static void main(String[] args) {
		String time = "12:45:54PM";
		String[] timeParts = time.split(":");
		String hr = timeParts[0];
		String min = timeParts[1];
		String sec = timeParts[2].substring(0,2);
		String amPm = timeParts[2].substring(2);
		
		Calendar cal = Calendar.getInstance();
		
		if(12 == Integer.parseInt(hr)
				&& "am".equalsIgnoreCase(amPm)) {
			cal.set(Calendar.HOUR_OF_DAY, 00);
		} else if ("pm".equalsIgnoreCase(amPm) && Integer.parseInt(hr) < 12) {
			cal.set(Calendar.HOUR_OF_DAY, 12+Integer.parseInt(hr));
		} else if ("pm".equalsIgnoreCase(amPm) && Integer.parseInt(hr) == 12) {
			cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hr));
		} else if("am".equalsIgnoreCase(amPm))  {
			cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hr));
		}
		
		cal.set(Calendar.MINUTE, Integer.parseInt(min));
		cal.set(Calendar.SECOND, Integer.parseInt(sec));
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
	}
}
