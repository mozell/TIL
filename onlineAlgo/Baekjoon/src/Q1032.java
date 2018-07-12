import java.util.Scanner;

public class Q1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		String result = "";
		for(int i = 0; i < n; i++) {
			strs[i] = sc.next();
		}
		
		sc.close();
		int flag = 0;
		// 첫번째의 처음 글자랑 다음 인덱스의 처음글자 - - - 비교 = 같으면 계속 비교, 아니면 ?
		for(int i = 0; i < strs[0].length(); i++) {  // 글자 갯수
			for(int j = 1; j < n; j++) { // n의 수
				if(strs[0].charAt(i) == strs[j].charAt(i)) {
					flag = 1;
					continue;
				}
				else {
					result = result+"?";
					flag = 0;
					break;
				}
			}
			if(flag != 0) result = result+strs[0].charAt(i);  // 모두 비교했을때 같으면 해당 글자를 결과에 추가
		}
		if(n==1)
			System.out.println(strs[0]);
		System.out.println(result);
	}
}
