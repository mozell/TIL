import java.io.*;
import java.util.StringTokenizer;

class Q14914{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int app = Integer.parseInt(st.nextToken());
        int bnn = Integer.parseInt(st.nextToken());
        int gcd = GCD(app, bnn);
        
        for(int i = 1; i <= gcd; i++){
            if(gcd % i == 0)
            	System.out.println(i+" "+app/i+" "+bnn/i);
        }
    }
    public static int GCD(int a, int b){
        if(b==0) 
        	return a;
        return GCD(b, a%b);
    }
}