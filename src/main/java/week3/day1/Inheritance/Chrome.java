package week3.day1.Inheritance;

public class Chrome extends Browser{
	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	}
	
	public void openIncognito() {
		System.out.println("Open Incognito");
	}
	
	public void clearCache() {
		System.out.println("Clear Cache");
	}

}
