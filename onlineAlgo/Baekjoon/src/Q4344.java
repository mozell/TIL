import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		for(int i = 0; i < c; i++) {
			int num = sc.nextInt();
			int[] score = new int[num];
			int sum = 0;
			for(int j = 0; j < num; j++) {
				score[j] = sc.nextInt();
				sum = sum + score[j];
			}
			double avg = sum / num;
			
			double overavg = 0;
			for(int k = 0; k < score.length; k++) {
				if(score[k] > avg)
					overavg++;
			
			}
			String result = String.format("%.3f", (overavg/num)*100);
			System.out.println(result+"%");
		}
	}
}
