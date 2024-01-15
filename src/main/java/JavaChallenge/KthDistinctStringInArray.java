package JavaChallenge;
public class KthDistinctStringInArray {
	public static String FindKthDistinctString(String str[],int n,int k) {
		int distinctcount=0;
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++)
				if(i!=j && str[i]==str[j])
					break;
				
				if(j==n)
					distinctcount++;
				
				if(distinctcount==k) {
					return str[i];
				}
		}
		return null;
	}
	public static void main(String[] args) {
		String str1[]= {"d","b","c","b","c","a"};
		int n1=str1.length;
		int k1=2;
		System.out.println(FindKthDistinctString(str1,n1,k1));
		
		String str2[]= {"aaa","aa","a"};
		int n2=str2.length;
		int k2=1;
		System.out.println(FindKthDistinctString(str2,n2,k2));
		
		String str3[]= {"a","b","a"};
		int n3=str3.length;
		int k3=3;
		System.out.println(FindKthDistinctString(str3,n3,k3));
	}
}
