package week3.day2.Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int [] arr1 = {3, 2, 11, 4, 6, 7};  //declaring the Array
		int arr2 []= {1, 2, 8, 4, 9, 7};    //Declaring the Array
		
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				
			if(arr1[i]==arr2[j])
			{
				System.out.println("Intersection numbers are "+arr2[j]);
				
			}
		}
		}
	
		
	}
}
