package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		String companyName="google";
		char[] charArray=companyName.toCharArray();
		
		Set<Character> cname = new LinkedHashSet<Character> ();
		
		for(Character name1: charArray)
		{
			cname.add(name1);
		}
		System.out.println("Unique characters are " +cname);
		
		
		
	}

}
