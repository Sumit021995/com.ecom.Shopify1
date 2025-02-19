package trainingUdemy;

import java.util.Arrays;
import java.util.List;

public class StringReverse {
	public static void main(String[] args) {
		String s="My name is sumit";
		// to print Sumit is name my
		String[] sArray = s.split(" ");
		List<String> ls = Arrays.asList(sArray);
//		List<String> newLs = ls.reversed();
		System.out.println(ls);
		String result ="";
		for(int i=ls.size()-1;i>=0;i--)
		{
			result +=ls.get(i)+" ";
//			System.out.println("-----");
		}
		System.out.println(result.trim());
	}
}
