// Projekt: give advice according to the temperature.
// Event according to the weather degree 

import java.util.Scanner;

public class AdviceTemperature {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Degree : ");
		int temperature = scan.nextInt();
		String event = " ";
		
		if ( temperature < 5 ) { 
			event = "Skiing";
		}else if ( temperature < 15) {
			event = "Theater";
		}else if ( temperature < 25) {
			event = "Grilling";
		}else {
			event = "Swimming";
		}
		
		System.out.println("Adviced event : " + event);
		scan.close();
	}
	

}

