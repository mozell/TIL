import java.util.Scanner;

public class Q2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		if(arr[1] - arr[0] == 1) {
			int i = 2;
			for( i = 2; i < arr.length; i++) {
				if(arr[i] - arr[i-1] != 1) {
					System.out.println("mixed");
					break;
				}
			}
			if(i == arr.length) System.out.println("ascending");
		}
		
		else if(arr[1] - arr[0] == -1) {
			int i = 2;
			for( i = 2; i < arr.length; i++) {
				if(arr[i] - arr[i-1] != -1) {
					System.out.println("mixed");
					break;
				}
			}
			if(i == arr.length) System.out.println("descending");
		}
		
		else
			System.out.println("mixed");
		
	}
}
