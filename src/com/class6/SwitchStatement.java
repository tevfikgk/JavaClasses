package com.class6;

public class SwitchStatement {

	public static void main(String[] args) {
		
		/*7 weekdays
		 * if day==1 ---- Monday
		 * *******
		 */
	
	/*if(day==1) {
		weekday="Monday";
	}else if (day==2) {
		weekday="Tuesday";
	}else if (day==3) {
		weekday="Wednesday";
	}else if (day==4) {
		weekday="Thursday";
	}else if (day==5) {
		weekday="Friday";
	}else if (day==6) {
		weekday="Saturday";
	}else if (day==7) {
		weekday="Sunday";
	}else  {
		weekday="invalid";
	}
	System.out.println(weekday);
	*/
	
		int day=7;
		String weekDay;	
		
		
	switch (day) {
	case 1:
		weekDay="Monday";
		break;
	case 2:
		weekDay="Tuesday";
		break;
	case 3:
		weekDay="Wednesday";
		break;
	case 4:
		weekDay="Thursday";	
		break;
	case 5:
		weekDay="Friday";
		break;
	case 6:
		weekDay="Saturday";
		break;
	case 7:
		weekDay="Sunday";
		break;
	default:
		weekDay="Invalid";
	}
	System.out.println(weekDay);
	
	}

}
