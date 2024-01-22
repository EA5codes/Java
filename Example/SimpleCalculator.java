// Project : To make a calculator that can perform 4 operations selected by the 
// user with 2 numbers entered

import java.util.Scanner;

public class SimpleCalculator{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Number: ");
		int a = scan.nextInt();

		System.out.println("2. Number: ");
		int b = scan.nextInt();

		System.out.println("Select an operation...");
		System.out.println("1 - addition operation");
		System.out.println("2 - subtraction operation");
		System.out.println("3 - multiplication operation");
		System.out.println("4 - division operation");
		System.out.println("your operation : ");

		int select = scan.nextInt();
		double result = 0;

		if (select == 1){
			result = a + b;
		}else if(select == 2){
			result = a - b;
		}else if(select == 3){
			result = a * b;
		}else if(select == 4){
			if(b == 0){
				System.out.println("Divisor cannot be 0!");
				
			}else{
				result = a / b;
			}
		}
		System.out.println("Result : " + result);

	}
}