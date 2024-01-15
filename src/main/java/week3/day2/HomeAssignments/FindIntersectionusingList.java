package week3.day2.HomeAssignments;
import java.util.*;
public class FindIntersectionusingList {
	public static void main(String[] args) {
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		List<Integer> lst1=new ArrayList<Integer>();
		List<Integer> lst2=new ArrayList<Integer>();
		
		//Adding elements to list
		for(int i=0;i<arr1.length;i++) {
			lst1.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			lst2.add(arr2[j]);
		}
		
		//Sorting both lists
		Collections.sort(lst1);
		System.out.println("List1 - Elements after sorting");
		for(int k:lst1) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		Collections.sort(lst2);
		System.out.println("List2 - Elements after sorting");
		for(int k:lst2) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//Find and Print intersection of elements
		System.out.println("Intersection elements are: ");
		for(int i=0;i<lst1.size();i++) {
			for(int j=0;j<lst2.size();j++) {
				if(lst1.get(i)==lst2.get(j)){
					System.out.print(lst1.get(i)+" ");
				}
			}		
		}
	}
}
