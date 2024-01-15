package week3.day2.HomeAssignments;
import java.util.*;
public class SecondlargestNumberUsingList {
	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		List<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		System.out.println("Elments after sorting:");
		for(int e:lst) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		int first=lst.get(0);
		int largest=lst.get(lst.size()-1);
		int secondlargest=lst.get(lst.size()-1-1);
		System.out.println("second largest element:" +secondlargest);
		
	}

}
