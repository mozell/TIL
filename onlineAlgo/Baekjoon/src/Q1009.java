import java.io.*;
import java.util.StringTokenizer;

class Q1009{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
       
        int a = 0, b = 0, temp = 0;
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            temp = a%10;
            
            for(int j = 1; j < b; j++)
                temp = (temp*a)%10;
            
            if(temp == 0) temp = 10;
            System.out.println(temp);
        }
    }
}