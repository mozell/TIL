import java.io.*;
import java.util.StringTokenizer;

class Q14659{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        StringTokenizer arrst = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        int idx = 0;
        while(arrst.hasMoreTokens()){
            arr[idx] = Integer.parseInt(arrst.nextToken());
            idx++;
        }
        
        int kill = 0, top = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]) kill++;
                else break;
            }
            if(kill > top) top = kill;
            kill = 0;
        }
        System.out.print(top);
    }
}