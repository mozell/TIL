import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0 ; i < t; i++) {
			String str = sc.next();
			Stack<String> st = new Stack<String>();
			int yorn = 0;
			for(int j=0; j < str.length(); j++) {
				if(st.isEmpty() && str.charAt(j)==')') {
					yorn = 1;
					break;
				}
				else if(str.charAt(j) == '(')
					st.push("(");
				else if(!st.isEmpty() && str.charAt(j) == ')')
					st.pop();
			}
			if(st.isEmpty() && yorn == 1)	System.out.println("NO");
			else if(!st.isEmpty())			System.out.println("NO");
			else							System.out.println("YES");
		}
		sc.close();
	}
}