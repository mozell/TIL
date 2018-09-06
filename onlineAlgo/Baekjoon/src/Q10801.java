import java.util.Scanner;
class Q10801{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[2][10];
        int A=0, B=0;
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 10; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < 10; i++){
            if(arr[0][i] > arr[1][i]) A++;
            else if(arr[0][i] < arr[1][i]) B++;
        }
        if(A>B) System.out.println("A");
        else if(A<B) System.out.println("B");
        else System.out.println("D");
    }
}