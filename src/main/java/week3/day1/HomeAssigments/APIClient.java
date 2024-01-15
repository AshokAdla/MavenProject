package week3.day1.HomeAssigments;

public class APIClient {
	public void sendRequest(String endPoint) {
		System.out.println("endPoint method "+endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("send request method "+endPoint+" "+requestBody+" "+requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient obj=new APIClient();
		String endPoint="URL";
		String requestBody="BODY";
		boolean requestStatus=true;
		obj.sendRequest(endPoint);
		obj.sendRequest(endPoint, requestBody, requestStatus);
	}
}
