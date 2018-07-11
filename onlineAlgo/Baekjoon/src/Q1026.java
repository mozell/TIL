import java.util.Scanner;

public class Q1026 {
	public void sort(int[] data){
        int size = data.length;
        int min; //최소값을 가진 데이터의 인덱스 저장 변수
        int temp;
        
        for(int i=0; i<size-1; i++){ // size-1 : 마지막 요소는 자연스럽게 정렬됨
            min = i;
            for(int j=i+1; j<size; j++){
                if(data[min] > data[j]){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] A;
		int[] B;
		A = new int[n];
		B = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		
		// A, B의 각 인덱스를 정렬하고
		// 정방향*역방향 의 각 곱을 더해 출력
		Q1026 q1026 = new Q1026();
		q1026.sort(A);
		q1026.sort(B);
		
		int S = 0;
		for(int i = 0; i <= A.length-1; i++) {
			S = S + A[i]*B[A.length-1-i];
		}
		System.out.println(S);
	}
}