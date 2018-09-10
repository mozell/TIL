import java.io.*;
import java.util.StringTokenizer;

class Q14656{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        
        StringTokenizer arrst = new StringTokenizer(br.readLine(), " ");
        int idx = 1, hit = 0;
        while(arrst.hasMoreTokens()){
            if(Integer.parseInt(arrst.nextToken()) != idx) hit++;
            idx++;
        }
        System.out.println(hit);
    }
}