import java.util.Scanner;
public class Q1475 {
	public static int getCharCount(String str, char c) {
		int count=0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[10];
		
		for(int i = 0; i < freq.length; i++) {
			freq[i] = getCharCount(str, Character.forDigit(i, 10));
		}
		
		int result = (freq[6]+freq[9])/2 + (freq[6]+freq[9])%2;
		for(int i = 0; i < freq.length; i++) {
			if(i == 6 || i == 9)
				continue;
			
			if(result < freq[i])
				result = freq[i];
		}
		
		System.out.println(result);
		
	}
}
