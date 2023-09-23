package week3.day1;

public class APIOverriding extends APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("I love the city " +endpoint);
	}
	
public void sendRequest (String endpoint,String requestBody,String requestStatus)
	
	{
		System.out.println("I Love Europe  " +  endpoint + " Eiffiel tower is iconic "+requestBody + " Winter is starts from "+requestStatus);
	}

	public static void main(String[] args) {
		
		
		APIClient client=new APIClient();
		client.sendRequest("London");
		client.sendRequest("Union", "place", "December");
		
	}

}
