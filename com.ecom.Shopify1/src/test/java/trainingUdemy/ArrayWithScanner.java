package trainingUdemy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Algorithm 1: Add  numbers entered by the user in an array

Step 1: Start
Step 2: Declare integer array and sum.
Step 3: Read values num1 and num2.
Step 4: Add num1 and num2 and assign the result to sum.
        sum←num1+num2
Step 5: Display sum
Step 6: Stop
 */
public class ArrayWithScanner {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
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
