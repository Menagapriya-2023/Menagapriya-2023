package week1.assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0, b=1, c=0;
		System.out.print(a+" "+b);
		
		for (int i=2;i<8;i++)
		{
			c =a+b; // 0+1//1+1//2=1
			System.out.print(" " +c );//1 2 3
			a=b;// 1
			b=c;//1 //2
			
			
		}

	}

}
