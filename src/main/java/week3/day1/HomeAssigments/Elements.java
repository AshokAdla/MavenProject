package week3.day1.HomeAssigments;

public class Elements extends Button{
	public void named() {
		System.out.println("named method");
	}
	public static void main(String[] args) {
		Elements obj=new Elements();
		obj.named();
		obj.click();
		obj.setText("Test");
		obj.submit();
	}

}
