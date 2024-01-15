package week4.day1;
import java.util.*;
public class learnSet {
	public static void main(String[] args) {
//		Set<String> mentors=new LinkedHashSet<String>();
//		mentors.add("Raghu");
//		mentors.add("Suraj");
//		mentors.add("prakash");
//		System.out.println(mentors);
		
		
//		Set<String> unique=new HashSet<String>();
//		for(int i=0;i<split.length;i++) {
//			unique.add(split[i]);
//		}
//		
//		for(String name:unique) {
//			System.out.print(name+" ");
//		}
		
		String sentence="Learning selenium using Selenium with Java";
		String splitarr[]=sentence.split(" ");
		
		Set<String> uniq=new LinkedHashSet<String>();
		Set<String> dup=new LinkedHashSet<String>();
		for(int i=0;i<splitarr.length;i++) {
			if(!uniq.add(splitarr[i])) {
				uniq.add(splitarr[i]);
			}else {
				dup.add(splitarr[i]);
			}
		}
		System.out.print(uniq);
		System.out.println();
		System.out.print(dup);
		
		
	}
}
