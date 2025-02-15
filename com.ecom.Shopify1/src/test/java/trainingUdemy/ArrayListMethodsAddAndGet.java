package trainingUdemy;

import java.util.ArrayList;

public class ArrayListMethodsAddAndGet {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Sumit Saurav");
		al.add(29);
		al.add("Test Engineer");
		for(Object o:al)
		{
			System.out.println(o);
		}
		System.out.println("==========");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}
