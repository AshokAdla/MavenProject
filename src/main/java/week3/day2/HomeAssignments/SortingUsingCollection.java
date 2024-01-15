package week3.day2.HomeAssignments;

import java.util.*;
public class SortingUsingCollection {
	public static void main(String[] args) {
		String arr[]= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> lst=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		for(int i=lst.size()-1;i>=0;i--) {
			System.out.print(lst.get(i)+" ");
		}
	}

}
