package week3.day2.Assignments;

public class JavaConnection implements DatabaseConnection {
	
	public void connect() {
		
		System.out.println("Internet is connected now");
		
	}

	public void disconnect() {
		
		
		
		System.out.println("Internet is disconnected now");
		
	}

	public void executeUpdate() {
		
		
		System.out.println("update the version");
		
		
	}

	public static void main(String[] args) {
		
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}

	public void connect(int a) {
		// TODO Auto-generated method stub
		
	}

	public void disconnect(int b) {
		// TODO Auto-generated method stub
		
	}

	public void executeUpdate(int c) {
		// TODO Auto-generated method stub
		
	}

	

}