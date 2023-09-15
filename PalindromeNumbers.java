package week1.assignment;

public class PalindromeNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input= 121, revNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = input;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (input > 0) {      // 121>0,12>0,1>0,0>0 
	      remainder = input % 10;      //121 % 10 =12/1,12%10 =1/2,1/10 =0,10/0=1
	      revNum = revNum * 10 + remainder;    // 0*10+1 =1,10+2=12,12*10+1 =121
	      input =input/10; //121/10= 12,1,0
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNum == revNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }


	}

