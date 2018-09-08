import java.util.Scanner;

public class Q2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String result = Character.toString(str.charAt(0));
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == '-') result += Character.toString(str.charAt(i+1));
			
		}
		
		System.out.println(result);
		sc.close();
	}
}
