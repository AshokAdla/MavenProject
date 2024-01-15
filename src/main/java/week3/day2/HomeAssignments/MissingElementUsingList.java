package week3.day2.HomeAssignments;
import java.util.*;
public class MissingElementUsingList {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,10,6,8};
		List<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		//Find missing elements
		int first=lst.get(0);
		int last=lst.get(lst.size()-1);
		for(int i=first;i<last;i++) {
			if(!lst.contains(i)) {
				System.out.print(i+" ");
			}
			
		}
	}
}
