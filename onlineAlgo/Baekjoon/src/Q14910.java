import java.io.*;
import java.util.StringTokenizer;

class Q14910{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String result = "Good";
        int pre = -1000001;
        
        while(st.hasMoreTokens()){
            int next = Integer.parseInt(st.nextToken());
            if(pre <= next && result.equals("Good")) result = "Good";
            else result = "Bad";
            pre = next;
        }
        System.out.println(result);
    }
}