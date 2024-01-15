package week3.day1.HomeAssigments;

public class removeDuplicateWordsInString {
	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		String words[]=text.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].trim().equalsIgnoreCase(words[j].trim())) {
					words[j]="";
					count++;
				}
			}
		}
		for(int k=0;k<words.length;k++) {
			System.out.print(words[k]+" ");
		}
		System.out.println();
	}
}