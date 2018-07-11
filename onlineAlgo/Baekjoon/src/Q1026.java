import java.util.Scanner;

public class Q1026 {
	public void sort(int[] data){
        int size = data.length;
        int min; //�ּҰ��� ���� �������� �ε��� ���� ����
        int temp;
        
        for(int i=0; i<size-1; i++){ // size-1 : ������ ��Ҵ� �ڿ������� ���ĵ�
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
		
		// A, B�� �� �ε����� �����ϰ�
		// ������*������ �� �� ���� ���� ���
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