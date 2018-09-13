import java.io.*;
import java.util.StringTokenizer;

class Q14912{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);
        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            String temp = String.valueOf(i);
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == d) cnt++;
            }
        }
        System.out.println(cnt);
    }
}