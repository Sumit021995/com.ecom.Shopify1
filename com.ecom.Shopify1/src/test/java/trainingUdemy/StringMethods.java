package trainingUdemy;

public class StringMethods {
	public static void main(String[] args) {
		String sample = "Sumit Saurav is my name";
		String newSample = new String("This String is created by New Key word");
		String[] sampleArray = sample.split(" ");
		for(String s:sampleArray)
		{
			System.out.println(s);
		}
	}
}
