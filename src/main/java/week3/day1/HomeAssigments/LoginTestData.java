package week3.day1.HomeAssigments;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("enter username method");
	}
	
	public void enterPassword() {
		System.out.println("enter password method");
	}
	
	public static void main(String[] args) {
		LoginTestData obj=new LoginTestData();
		obj.enterUsername();
		obj.enterPassword();
		obj.enterCredentials();
		obj.navigateToHomePage();
	}
}
