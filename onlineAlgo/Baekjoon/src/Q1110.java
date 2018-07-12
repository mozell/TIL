import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 1;
		int check = n;
		
		while(true) {
			int oneNum = n/10;
			int tenNum = n%10;
			int temp = oneNum + tenNum;
			
			n = tenNum*10 + temp%10;
			
			if(n == check)
				break;
			else 
				cnt++;
		}
		System.out.println(cnt);
	}
}