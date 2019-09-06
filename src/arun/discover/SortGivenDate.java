package arun.discover;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortGivenDate {
	static List<String> dateList = new ArrayList<>();
	static Map<String, Integer> monthNo = new HashMap<>();
	
	public static void main(String[] args) {
		dateList.add("13 Jan 2910");
		dateList.add("30 Jun 1987");
		dateList.add("30 Feb 1767");
		dateList.add("16 Mar 1810");
		dateList.add("11 Apr 1687");
		dateList.add("09 May 4367");
		dateList.add("8 Jan 1760");
		dateList.add("9 Dec 2107");
		dateList.add("14 Aug 2167");
		
		monthNo.put("Jan", 0);
		monthNo.put("Feb", 1);
		monthNo.put("Mar", 2);
		monthNo.put("Apr", 3);
		monthNo.put("May", 4);
		monthNo.put("Jun", 5);
		monthNo.put("Jul", 6);
		monthNo.put("Aug", 7);
		monthNo.put("Sep", 8);
		monthNo.put("Oct", 9);
		monthNo.put("Nov", 10);
		monthNo.put("Dec", 11);
		
		sort();
	}
	
	private static void sort() {
		List<Long> finalDlist = new ArrayList<>();
		
		dateList.forEach( dateStr -> {
			String[] str = dateStr.split(" ");
			int d1 = Integer.parseInt(str[0]);
			String m = str[1];
			int y = Integer.parseInt(str[2]);
			
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DATE, d1);
			cal.set(Calendar.MONTH, monthNo.get(m));
			cal.set(Calendar.YEAR, y);
			 
			finalDlist.add(cal.getTimeInMillis());
			
		});
		
		Collections.sort(finalDlist);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		finalDlist.forEach( time -> {
			Date d = new Date(time);
			System.out.println(sdf.format(d));
		});
	}
	
}
