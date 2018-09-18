import java.util.Scanner;

class Q13698{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String shuffle = sc.nextLine();
        int[] arr = new int[]{0,1,0,0,2};
        
        for(int i = 0; i < shuffle.length(); i++){
            char a = shuffle.charAt(i);
            int temp;
            switch(a){
               case 'A':
                    temp = arr[1];
                    arr[1] = arr[2];
                    arr[2] = temp;
                    break;
               case 'B':
                    temp = arr[1];
                    arr[1] = arr[3];
                    arr[3] = temp;
                    break;
               case 'C':
                    temp = arr[1];
                    arr[1] = arr[4];
                    arr[4] = temp;
                    break;
               case 'D':
                    temp = arr[2];
                    arr[2] = arr[3];
                    arr[3] = temp;
                    break;
               case 'E':
                    temp = arr[2];
                    arr[2] = arr[4];
                    arr[4] = temp;
                    break;
               case 'F':
                    temp = arr[3];
                    arr[3] = arr[4];
                    arr[4] = temp;
                    break;
            }
        }
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j] == i){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}