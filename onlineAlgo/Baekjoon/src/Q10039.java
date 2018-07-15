import java.util.Scanner;

public class Q10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int total = 0;
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			if(scores[i] < 40) total += 40;
			else total = total + scores[i];
		}
		System.out.println(total/5);
		sc.close();
	}
}
