package week1.assignment;

public class IsPrime {

	public void isPrimeNumber(int num)
	{
		boolean flag=false;
		//num Value should be greater one
		if (num<=1)
		{
			flag=false;
		}
		
		//iteration 
		for(int i=2;i<=num/2;i++) {
			// condition for prime number
			if (num % i ==0) 	
			{
			flag=false;
			System.out.println(num+  "It's not a prime number");
		}
	
		else {
			System.out.println(num+" it's a prime number");
		}
		}
}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		// assigning num value to check the prime number
		
		IsPrime primeNum=new IsPrime();
		//primeNum.isPrimeNumber(38);
		primeNum.isPrimeNumber(15);
		
	}
}

	
	
	


