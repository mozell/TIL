import java.util.Scanner;

class Q10798{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = new String[5];
        
        for(int i = 0; i < 5; i++)
            input[i] = sc.nextLine();
        int max = input[0].length();
        for(int i = 0; i < 5; i++)
            if(max < input[i].length()) max = input[i].length();
        
        char[][] words = new char[5][max];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < max; j++){
                if(j < input[i].length()) words[i][j] = input[i].charAt(j);
                else words[i][j] = '-';
            }
        }
        
        String result = "";
        for(int j = 0; j < max; j++){
            for(int i = 0; i < 5; i++){
                if(words[i][j] != '-') result = result + words[i][j];
            }
        }
        
        System.out.println(result);
    }
}