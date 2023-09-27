package week3.day2.Assignments;

import java.util.Arrays;

public class FindLargest {

	public static void main(String[] args) {
		int [] arr ={3, 2, 11, 4, 6, 7}; //declare the value
		Arrays.sort(arr);   //sort the array 2,3,4,6,7,11
		int max= Integer.MIN_VALUE; //To find the min value and assigning to max
		
		for (int i=0;i<arr.length;i++) 
		{
		
			if(arr[i]>max)  
			{
				max=arr[i];
			}
	   }
		
		System.out.println("The largest number in the Array is " +max);	
		
		
		
	}

}

