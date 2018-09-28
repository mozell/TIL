import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Q14602{
    static int[][] A;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
    
        A = new int[m][n];
        
        for(int i = 0; i < A.length; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int j = 0;
            while(st.hasMoreTokens()){
                A[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
        
        for(int i = 0; i < m-w+1; i++){
            for(int j = 0; j < n-w+1; j++){
                System.out.print(median(i,j,w)+" ");
            }
            System.out.println();
        }
    }
    public static int median(int i, int j, int w){
        int[] temp = new int[w*w];
        int idx = 0;
        for(int ii = i; ii < i+w; ii++){
            for(int jj = j; jj < j+w; jj++){
                temp[idx] = A[ii][jj];
                idx++;
            }
        }
        Arrays.sort(temp);
        return temp[temp.length/2];
    }
}