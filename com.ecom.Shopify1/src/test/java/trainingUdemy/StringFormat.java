package trainingUdemy;

import java.util.Scanner;

public class StringFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		System.out.println("Enter a number");
		int i = sc.nextInt();
		String result = String.format("%-15s%3d",s,i);
//		System.out.printf("%-15s%3d",s,i);
		System.out.println(result);
		System.out.println(result.length());
	}
}
