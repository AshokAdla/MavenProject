package week3.day1.Polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.reportStep("ReportStepmethod1", "Active");
		p.reportStep("ReportStepmethod2", "Active", true);
	}
	
	public void reportStep(String msg,String status) {
		System.out.println(msg+" "+status);
	}
	
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg+" "+status+" "+snap);
	}

}
