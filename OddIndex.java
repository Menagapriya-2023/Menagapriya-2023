package week3.day2.Assignments;

public class OddIndex {

	public static void main(String[] args) {
		 String test = "changeme";
		 char [] array =test.toCharArray();
		 
		for( int i=array.length;i>=0;i--)
			{
			
			if(i % 2!=0)
			{
				array[i]=Character.toUpperCase(array[i]);
			}
		}
		
		String s1=new String (array);
		System.out.println("Converted string is " +s1);
		 
		 


	}

}
