package week3.day2.Assignments;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String text1 ="stops"; 
		String text2 ="potss";
		char [] charArray1 = text1.toCharArray();
		char [] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		int a=charArray1.length;
		int b=charArray2.length;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i=0;i<charArray1.length;i++) {
			
			for (int j=0;j<charArray2.length;j++) {
				
				if(charArray1[i]==charArray2[j])
				{
					System.out.println("Length is matched");
				}
			
				else {
				
					System.out.println("The given strings are not an Anagram");
				}
		
			}
		
	}
}}

