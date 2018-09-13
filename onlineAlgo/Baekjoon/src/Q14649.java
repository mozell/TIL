import java.util.Scanner;

class Q14649{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[101];
        
        for(int i = 0; i < n; i++){
            int pos = sc.nextInt();
            char rl = sc.next().charAt(0);
            biseo(arr, pos, rl);
        }
        result(arr, p);
        sc.close();
    }
    public static int[] biseo(int[] arr, int pos, char rl){
        if(rl == 'R')
            for(int i = pos + 1; i < arr.length; i++) arr[i]++;
        else
            for(int i = 1; i < pos; i++) arr[i]++;
        return arr;
    }
    public static void result(int[] arr, int p){
        int b = 0, r = 0, g = 0;
        for(int i = 1; i < arr.length; i++){
            int n = arr[i] % 3;
            switch(n){
                case 0 : b++; break;
                case 1 : r++; break;
                case 2 : g++; break;
            }
        }
        System.out.printf("%.2f\n", p*b/100.0);
        System.out.printf("%.2f\n", p*r/100.0);
        System.out.printf("%.2f", p*g/100.0);
    }
}