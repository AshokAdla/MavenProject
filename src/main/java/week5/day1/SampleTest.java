package week5.day1;

public class SampleTest {
	public static void main(String[] args) {
		String subtotalprice="₹1,64,999.00";
		String[] price=subtotalprice.split("₹");
		System.out.println(price[1]);
		
		String f="1,64,999";
		System.out.println(f+".00");
		
	}

}


//SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
//SLF4J: Defaulting to no-operation (NOP) logger implementation
//SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
//ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
//Dec 19, 2023 7:14:24 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find an exact match for CDP version 120, so returning the closest version found: 117
//Price of first product :1,64,999
//Number of customer ratings :188
//Parent window id :D37D7D13C7581426CB1DEC1499C3427D
//Child window id :12898CF27700DE35441AAEEECB04EC87
//Sub total price is :₹1,64,999.00
//Price of first product: 1,64,999 and Sub total price in cart is: ₹1,64,999.00 are not matching
