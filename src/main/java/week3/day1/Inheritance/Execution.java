package week3.day1.Inheritance;

public class Execution {
	public static void main(String[] args) {
		Browser b=new Browser();
		b.openURL();
		b.closeBrowser();
		b.navigateBack();
		
		Chrome c=new Chrome();
		c.openIncognito();
		c.clearCache();
		
		Edge e=new Edge();
		e.takeSnap();
		e.clearCookies();
		
		Safari s=new Safari();
		s.readerMode();
		s.fullScreenMode();
	}
}
