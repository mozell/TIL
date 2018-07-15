import java.util.Scanner;

public class Q2577 {
	public static int getCharCount(String str, char c) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int[] numCounter = new int[10];
		int result = a * b * c;
		String resultStr = Integer.toString(result);
		
		for(int i = 0; i < numCounter.length; i++) {
			numCounter[i] = getCharCount(resultStr, Character.forDigit(i, 10));
			System.out.println(numCounter[i]);
		}
	}
}

// (Çüº¯È¯) int to char : Character.forDigit(a, 10);