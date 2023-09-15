package week1.assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,3,2,8,6,7};  // 31 //36
		Arrays.sort(a);           //{1,2,3,4,6,7,8}
		
		int max=a.length+1;        
       int sum=(max*(max+1))/2;      //(8*9)/2 =36
	
		 for (int i=0;i<a.length;i++)
		 {
		sum=sum-a[i];  
		 }
				 
		//	 if(((a[i+1])-(a[i]))!=1) //2-1//3-1//4-1//5-4
			 
		System.out.println("Missing number is "  +sum);
			 
				
			 }
		 }

	




