package week3.day2.Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare the string
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		//split the word
		String [] word=text.split(" ");
		
		//initialize int variable to increment the loop if condition pass
		
		int count =0;
		
		//use nested for loop to compare the word
		for (int i=0;i<word.length;i++)
		
		{
			for (int j=i+1;j<word.length;j++)
			{
			if(word[i].equals(word[j])) {
				count++;
				word[j]=" ";
			}
		}
		}
		
    for (int i=0;i<word.length;i++)
   {
	if(!word[i].equals(" ")) {
		System.out.println(word[i]);
	}
	
}
	}

}
