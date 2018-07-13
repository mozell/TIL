public class Q4673 {
	public static int Dn(int n) {
		int dn = n;
		while(n>0) {
			dn += n%10;
			n = n/10;
		}
		return dn;
	}
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		
		for(int num = 1; num <= 10000; ++num) {
			int dn = Dn(num);
			if(dn <= 10000) {
				arr[dn] = true;
			}
		}
		
		for(int num = 1; num < arr.length; ++num) {
			if(!arr[num]) {
				System.out.println(num);
			}
		}
	}
}
