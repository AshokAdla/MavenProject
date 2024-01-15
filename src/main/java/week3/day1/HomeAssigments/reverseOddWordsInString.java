package week3.day1.HomeAssigments;

public class reverseOddWordsInString {
	public static void main(String[] args) {
		String test="I am a software tester";
		String words[]=test.split(" ");
		for(int i=0;i<words.length;i++) {
			if(i%2!=0) {
				char ch[]=words[i].toCharArray();
				for(int k=ch.length-1;k>=0;k--) {
					System.out.print(ch[k]);
				}
				System.out.print(" ");
			}else {
				System.out.print(words[i]+" ");
			}
		}
	}

}
