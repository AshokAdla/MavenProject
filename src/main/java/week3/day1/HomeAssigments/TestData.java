package week3.day1.HomeAssigments;

public class TestData {
	public void enterCredentials() {
		System.out.println("enter credentials method");
	}
	
	public void navigateToHomePage() {
		System.out.println("navigate to home page method");
	}
	
	public static void main(String[] args) {
		TestData obj=new TestData();
		obj.enterCredentials();
		obj.navigateToHomePage();
	}

}
