package week3.day1.Inheritance;

public class Edge extends Browser{
	public static void main(String[] args) {
		Edge e=new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
	}
	
	public void takeSnap() {
		System.out.println("Take Snap");
	}
	
	public void clearCookies() {
		System.out.println("Clear Cookies");
	}
}
