package trainingUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToArrayListConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		for(int i = 0;i<names.length;i++)
		{
			System.out.println("Enter names");
			names[i]=sc.nextLine();
		}
		System.out.println(Arrays.toString(names));
		List<String> namesList = Arrays.asList(names);
		System.out.println(namesList);
//		namesList.add("Rahul");
//		namesList.add("Ram");
		System.out.println(namesList.contains("Amit"));
	}
}
