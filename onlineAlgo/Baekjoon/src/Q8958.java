import java.util.Scanner;
import java.util.StringTokenizer;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for(int i = 0; i < tc; i++) {
			String ox = sc.next();
			int cntO = 0;
			int totalScore = 0;
			StringTokenizer st = new StringTokenizer(ox, "X");
			int[] arr;
			
			while(st.hasMoreTokens()) {

				String nextToken = st.nextToken();
				cntO = nextToken.length();
				arr = new int[cntO];
				

				for(int score = 0; score < cntO ; score++) {
					arr[score] = score + 1;
					totalScore = totalScore + arr[score];
				}
			}

			System.out.println(totalScore);

		}
		sc.close();
	}
}
