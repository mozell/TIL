import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Q10815{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer sg = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(br.readLine());
        StringTokenizer com = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[n];
        int idx = 0;
        while(sg.hasMoreTokens()){
            arr[idx] = Integer.parseInt(sg.nextToken());
            idx++;
        }
        Arrays.sort(arr);
        
        for(int i = 0; i < m; i++){
            search(arr, Integer.parseInt(com.nextToken()));
        }
    }
    
    public static void search(int[] arr, int x){
        int mid;
        int left = 0;
        int right = arr.length-1;
        
        while(right >= left){
            mid = (right+left) / 2;
            if(x == arr[mid]){
                System.out.print("1 ");
                break;
            }
            
            if(x < arr[mid]) right = mid-1;
            else left = mid+1;
            
            if(right < left) System.out.print("0 ");
        }
    }
}