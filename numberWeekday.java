import java.util.Scanner;

public class numberWeekday {

public static void main(String[] args)
{
	try (Scanner scan = new Scanner (System.in)) {
		System.out.print("Number between 1 and 7:");

		int day=scan.nextInt();
		System.out.println(getDayName(day));
	}
} 
public static String getDayName(int day) {
	String dayName="";
	switch (day) {
	case 1:dayName="It's Monday";break;
	case 2:dayName="It's Tuesday";break;
	case 3:dayName="It's Wednesday";break;
	case 4:dayName="It's Thursday";break;
	case 5:dayName="It's Friday";break;
	case 6:dayName="It's Saturday";break;
	case 7:dayName="It's Sunday";break;
	default:dayName="It is an invalid day range.";
	}
	return dayName;	
	
}	
}
	
	