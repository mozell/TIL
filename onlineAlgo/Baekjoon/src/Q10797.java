import java.util.Scanner;

class Q10797{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int result = 0;
        for(int i = 0; i < 5; i++){
            int temp = sc.nextInt();
            if(day == temp) result++;
        }
        System.out.println(result);
        sc.close();
    }
}