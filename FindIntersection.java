package week3.day2.Assignments;

import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int [] arr1 = {3, 2, 11, 4, 6, 7};  //declaring the Array
		int arr2 []= {1, 2, 8, 4, 9, 7};    //Declaring the Array
		
		//declare the two linkedlist to store the array values
		List<Integer> input1=new LinkedList<Integer> ();
		List<Integer> input2=new LinkedList<Integer> ();
		
	//convert the arr1 values into input1	
		for (int num :arr1)
			{
			input1.add(num);
		}
		
		////convert the arr1 values into input2
		for (int num :arr2)
		{
		input2.add(num);
	}
		//declare one more linkedlist and add input1
		List<Integer> Intersection=new LinkedList<Integer> (input1);
		Intersection.retainAll(input2);
		System.out.println(Intersection);
	
		}
		
	
		
	}
