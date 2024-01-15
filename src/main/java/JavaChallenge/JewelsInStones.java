package JavaChallenge;

public class JewelsInStones {
	public static int FindJewelsInStones(String jewels,String stones) {
		char jewls[]=jewels.toCharArray();
		char stons[]=stones.toCharArray();
		int count=0;
		for(int i=0;i<jewls.length;i++) {
			for(int j=0;j<stons.length;j++) {
				if(jewls[i]==stons[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String jewels1="aA";
		String stones1="aAAbbbb";
		System.out.println(FindJewelsInStones(jewels1,stones1));
		
		String jewels2="z";
		String stones2="ZZ";
		System.out.println(FindJewelsInStones(jewels2,stones2));
	}

}
