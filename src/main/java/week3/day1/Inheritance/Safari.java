package week3.day1.Inheritance;

public class Safari extends Browser {
	public static void main(String[] args) {
		Safari s=new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
	}
	
	public void readerMode() {
		System.out.println("Reader Mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Full Screen mode");
	}
}
