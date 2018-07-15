import java.util.Scanner;

public class Q10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i = 0; i < tc; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int xx,yy;
			
//			int[][] hotel = new int[H][W];
//			for(int h = 0; h < hotel.length; h++) {
//				for(int w = 0; w < hotel[h].length; w++) {
//					hotel[h][w] = ((h+1)*100)+(w+1);
//				}
//			}
//			System.out.println(hotel[xx][yy]);
			
			// xx = Ãþ¼ö
			if(N % H == 0) xx = H - 1;
			else xx = N % H - 1;
			// yy = È£¼ö
			if(N % H == 0) yy = N / H - 1;
			else yy = N / H;
			
			System.out.println((xx+1)*100 + (yy+1));
		
		}
		sc.close();
	}
}
			