package trainingUdemy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIOScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al=new ArrayList();
		
//		System.out.println(al.size());
		Object o;
		
		while(true)
		{
			System.out.println("Enter elements:");
			 o = sc.nextLine(); 
			 if(o=="")
				 break;
			 al.add(o);
		}
		System.out.println(al);
	}
}
