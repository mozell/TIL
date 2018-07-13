import java.util.Scanner;

public class Q1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] score = new float[n];
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		float max = score[0];
		for(int i = 1; i < score.length; i++) {
			if(max < score[i])
				max = score[i];
		}
		
		float sum = 0;
		for(int i = 0; i < score.length; i++) {
			score[i] = score[i]/max*100;
			sum = sum + score[i];
		}
		
		System.out.printf("%.2f", sum/n);
	}
}
