import java.io.*;
import java.util.StringTokenizer;

class Q14596{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
    
        int[][] A = new int[h][w];
        int[][] B = new int[h][w];
        int[][] temp = new int[h][w+2];
        
        for(int i = 0; i < A.length; i++){        // A 행렬
            st = new StringTokenizer(br.readLine(), " ");
            int j = 0;
            while(st.hasMoreTokens()){
                A[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
        
        for(int i = 0; i < B.length; i++){        // B 행렬
            st = new StringTokenizer(br.readLine(), " ");
            int j = 0;
            while(st.hasMoreTokens()){
                B[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
        
        for(int i = 0; i < temp.length; i++){	// 겹친거, 제곱까지
            for(int j = 0; j < temp[i].length; j++){
                if(j==0 || j==temp[i].length-1)
                    temp[i][j] = 99999;
                else
                    temp[i][j] = (A[i][j-1]-B[i][j-1])*(A[i][j-1]-B[i][j-1]);
            }
        }
        
        for(int i = 1; i < temp.length; i++){	// 좌우로 한열씩 추가해서 3개씩 비교하기 쉽게
            for(int j = 1; j < temp[i].length-1; j++){
                temp[i][j] = min(temp, i, j);
            }
        }
        
        int result = temp[temp.length-1][1];	// 작은거 골라내기
        for(int i = 1; i < w+1; i++){
            if(result > temp[temp.length-1][i]) result = temp[temp.length-1][i];
        }
        System.out.println(result);
    }
    
    public static int min(int[][] temp, int i, int j){
        int min = temp[i-1][j-1];
        for(int k = 1; k < 3; k++){
            if(min > temp[i-1][j-1+k]) min = temp[i-1][j-1+k];
        }
        return min + temp[i][j];
    }
}