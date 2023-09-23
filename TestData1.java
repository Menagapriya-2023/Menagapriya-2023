package week3.day1;

public class TestData1 extends TestData {
	
	public void inheritance( ) {
		
		System.out.println("Learning inheritance");
	}

	public void conceptLearning() {
		
		System.out.println("Concept Learning");
	}
	public static void main(String[] args) {
		
		TestData1 td=new TestData1();
		System.out.println(td.name);
		System.out.println(td.password);
		td.inheritance();
		td.conceptLearning();
		td.enterCredentials();
		td.navigateToHomePage();
		
		
		
	}

}
