import java.util.StringTokenizer;
import java.util.Scanner;

public class Q1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int result = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			result++;
		}
		System.out.println(result);
	}
}
