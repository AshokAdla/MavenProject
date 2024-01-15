package week3.day1.Inheritance;

public class Browser {
	public static void main(String[] args) {
		String browserName="Chrome";
		String browserVersion="119.0";
	}
	
	public void openURL() {
		System.out.println("Opening URL");
	}
	
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	
	public void navigateBack() {
		System.out.println("Navigating back");
	}
}
