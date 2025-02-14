package trainingUdemy;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayWithScanner {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int sum=0;
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element arr["+i+"] of an array");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of elements of an Array(arr): "+sum);
		System.out.println("Program Ends");
		
		
	}
}
