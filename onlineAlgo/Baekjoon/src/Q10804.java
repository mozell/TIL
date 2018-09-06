import java.util.Scanner;

class Q10804{
    public static int[] reverse(int[] arr, int i1, int i2){
        int length = i2 - i1 + 1;
        int[] temp = new int[length];
        
        for(int i = 0; i < length; i++){
            temp[i] = arr[i2-1-i];
        }
        
        int tempidx = 0;
        for(int i = i1-1; i <= i2-1; i++){
            arr[i] = temp[tempidx];
            tempidx++;
        }
        
        return arr;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] cards = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            reverse(cards, a, b);
        }
        for(int i = 0; i <20; i++){
            System.out.print(cards[i]+" ");
        }
    }
}