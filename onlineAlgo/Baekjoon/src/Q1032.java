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
		// ù��°�� ó�� ���ڶ� ���� �ε����� ó������ - - - �� = ������ ��� ��, �ƴϸ� ?
		for(int i = 0; i < strs[0].length(); i++) {  // ���� ����
			for(int j = 1; j < n; j++) { // n�� ��
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
			if(flag != 0) result = result+strs[0].charAt(i);  // ��� �������� ������ �ش� ���ڸ� ����� �߰�
		}
		if(n==1)
			System.out.println(strs[0]);
		System.out.println(result);
	}
}
