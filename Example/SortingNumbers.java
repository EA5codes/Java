// purpose = sorting the 3 numbers entered from largest to smallest
import java.util.Scanner;

public class SortingNumbers {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Number(a): ");
		int a = scan.nextInt();

		System.out.println("2. Number(b): ");
		int b = scan.nextInt();

		System.out.println("3. Number(c): ");
		int c = scan.nextInt();
		scan.close();
		
		if (a > b && a > c) {
			// a is big
			if (b > c) {
				System.out.println("a > b > c");
			}else {
				System.out.println("a > c > b");
			}

		}else if (b > a && b > c) {
			// b is big 
			if (a > c){
				System.out.println("b > a > c");
			}else {
				System.out.println("b > c > a");
			}
		}else {
			// c is big 
			if (a > b){
				System.out.println("c > a > b");
			}else {
				System.out.println("c > b > a");
			}
		}

	}
	
}
