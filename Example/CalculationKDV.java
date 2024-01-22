// VAT is 18% 

import java.util.Scanner;

public class CalculationKDV {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double price, total, kdvPrice, rate = 18;   // KDV rate 18.
		System.out.print("Enter amount : ");
		price = scan.nextDouble();
		
		
		kdvPrice = price * (rate / 100);
		total = kdvPrice + price;
		
		System.out.println("KDV Rate : %" + (int)rate);
		System.out.println("KDV Amount : " + kdvPrice);
		System.out.println("Amount mit KDV Rate : " + total);
		
		
	}
}