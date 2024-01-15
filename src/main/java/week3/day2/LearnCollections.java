package week3.day2;

import java.util.*;
public class LearnCollections {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("Aravind");
		lst.add("Raghu");
		lst.add("Meerut");
		System.out.println(lst);
		
		for(String a:lst) {
			System.out.println(a);
		}
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}
