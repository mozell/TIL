import java.util.Scanner;

public class Q1003 {
	static int cnt0;
	static int cnt1;
	
	public int fibo(int n) {
		if(n==0) {
			cnt0++;
			return 0;
		}
		else if(n==1) {
			cnt1++;
			return 1;
		}	
		else
			return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q1003 q = new Q1003();
		
		int testcase = sc.nextInt();
		int n;
		for(int i = 0; i < testcase; i++) {
			n = sc.nextInt();
			q.fibo(n);
			System.out.println(cnt0+" "+cnt1);
			cnt0 = 0;
			cnt1 = 0;
		}
	}
}
