package trainingUdemy;

import java.util.Arrays;
import java.util.Scanner;

public class BreakLoop {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element arr["+i+"] of an array");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				System.out.println("Loop breaked with break keyword");
				break;
				
			}
		}
		System.out.println(Arrays.toString(arr));
//		System.out.println("Sum of elements of an Array(arr): "+sum);
		System.out.println("Program Ends");
	}
}
