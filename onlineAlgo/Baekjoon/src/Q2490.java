import java.util.Scanner;

public class Q2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] resultArr = new String[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			String result = "";
			int cnt = 0;
			
			for(int j = 0; j < 4; j++) {
				int isZero = sc.nextInt();
				if(isZero == 0) cnt++;
			}
			
			if(cnt == 1) result = result+"A";
			else if(cnt == 2) result = result+"B";
			else if(cnt == 3) result = result+"C";
			else if(cnt == 4) result = result+"D";
			else  result = result+"E";
			resultArr[i] = result;
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(resultArr[i]);
		}
	}
		
}
