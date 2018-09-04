import java.util.Scanner;

class Q2028{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            String strN = String.valueOf(n);
            String expN = String.valueOf(n*n);
            String isStrN = expN.substring((expN.length() - strN.length()));
            
            if(strN.equals(isStrN)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}