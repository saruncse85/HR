package java.arun.problemsolving;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class DayOfProgrammer {
	
	static Map<Integer, Integer> monthDays = new HashMap<>();
	
	private void init() {
		monthDays.put(01, 31);
		monthDays.put(02, 28);
		monthDays.put(03, 31);
		monthDays.put(4, 30);
		monthDays.put(5, 31);
		monthDays.put(6, 30);
		monthDays.put(7, 31);
		monthDays.put(8, 31);
		monthDays.put(9, 30);
		monthDays.put(10, 31);
		monthDays.put(11, 30);
		monthDays.put(12, 31);
	}
	
	public static void main(String[] args)  {
		int year = 1918;
		boolean leapYear = false;
		if(year <= 1917) {
			//follow Julian Logic
			if(year%4 == 0){
				System.out.println("Julian Leap year "+year);
				monthDays.put(2, 29);
				leapYear = true;
			} else {
				System.out.println("Not a Julian Leap year "+year);
			}
		} else if (year > 1918) {
			//follow Gregorian Logic
			if(year%400 == 0) {
				System.out.println("Julian Leap year "+year);
				monthDays.put(2, 29);
				leapYear = true;
			} else if (year%4 ==0 && year%100 !=0) {
				System.out.println("Julian Leap year "+year);
				monthDays.put(2, 29);
				leapYear = true;
			} else {
				System.out.println("Not a Julian Leap year "+year);
			}
		} else if (year == 1918) {
			if(year%4 == 0){
				System.out.println("Julian Leap year "+year);
				monthDays.put(2, 29-13);
				leapYear = true;
			} else {
				System.out.println("Not a Julian Leap year "+year);
				monthDays.put(2, 28-13);
			}
		}
		
		int sum = 365;
		if(leapYear)
			sum = 366;
		
		int index = 1;
		while(sum - (monthDays.get(index))>0){
			sum = sum - (monthDays.get(index));			
		}
		System.out.println("month is "+index);
		System.out.println("date is "+(-sum));
	}
}


/*  logic 

1700 --- 2700


<= 1917 Julian calendar

>=1918 Gregorian calendar

1918 14th Feb is the first date after jan 31st.

leap year feb - 29 days
other year feb - 28 days

Julian calendar leap year /4

Gregorian calendar 
	leap year is /400 or (/4 and !/100)

default map feb - 28

if(year <= 1917)
	//follow julian leap year formula
	if(year mod 4 == 0)
		leap year;map.put(feb, 29)
if(year >= 1918)
	//follow Gregorian leap year formula
	if(year Mod 400)
		leap year
		map.put("Feb",29)
		
	else if (1984 Mod 4 == 0 && 1984 mod 100 != 0)
		leap year
		map.put("Feb",29)

sum = 256;
total days = 0;
while(sum - Month date > 0)
	sum = 256-month date
	totalDays += monthDays

Sum = 256 -31 = 225
225-29=196
196-31=165
165-30=135
135-31=104
104-30=74
74-31=43
43-31=12
12-30 = -18


then date is last value of that month
*/