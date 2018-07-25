import java.util.Scanner;

public class Q2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in, out, total = 0;
		int[] sum = new int[4];

		for(int i = 0; i < 4; i++) {
			out = sc.nextInt();
			in = sc.nextInt();
			total = total + in - out;
			sum[i] = total;
		}
		sc.close();
		
		in = sum[0]; // max
		for(int i = 1; i < sum.length; i++) {
			if(in < sum[i]) in = sum[i];
		}
		System.out.println(in);
	}
}
