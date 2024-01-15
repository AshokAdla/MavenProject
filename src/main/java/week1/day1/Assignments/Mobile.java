package week1.day1.Assignments;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="Samsung";
		float mobileWeight=100.50f;
		System.out.println("mobileModel:"+mobileModel+",  mobileWeight:"+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=20000;
		System.out.println("isFullCharged:"+isFullCharged+",  mobileCost:"+mobileCost);
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		System.out.println("--This is my mobile--");
		obj.makeCall();
		obj.sendMsg();
	}

}
