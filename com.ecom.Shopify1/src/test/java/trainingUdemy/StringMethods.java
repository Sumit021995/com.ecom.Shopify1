package trainingUdemy;

import java.util.Arrays;
import java.util.List;

public class StringMethods {
	public static void main(String[] args) {
		String sample = "Sumit Saurav is my name";
		String newSample1 = new String("This String is created by New Key word");
		String[] newSample = newSample1.split(" ");
		for(String s:newSample)
		{
			System.out.println(s);
		}
		List<String> listOfSampleArray = Arrays.asList(newSample);
		System.out.println(listOfSampleArray.contains("Key"));
		
	}
}
