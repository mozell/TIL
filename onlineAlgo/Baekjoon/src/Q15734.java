import java.io.*;
import java.util.StringTokenizer;

class Q15734{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        
        for(int i = A; i > 0; i--){
            if(L==R && i>=2){
                L++;
                R++;
                i--;
            }
            else if(L==R && i<2) break;
            else if(L > R) R++;
            else if(R > L) L++;
        }
        
        if(L==R) System.out.println(L+R);
        else if(L > R) System.out.println(R*2);
        else System.out.println(L*2);
    }
    
}