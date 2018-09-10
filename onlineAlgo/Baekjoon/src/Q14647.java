import java.io.*;
import java.util.StringTokenizer;

class Q14647{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] bingo = new String[n][m];
        int hitCnt = 0, hitTot = 0, hitMax = 0;
        
        //행 체크
        for(int i = 0; i < n; i++){
            StringTokenizer loopst = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < m; j++){
                bingo[i][j] = loopst.nextToken();
                for(int k = 0; k < bingo[i][j].length(); k++){
                    if("9".equals(String.valueOf(bingo[i][j].charAt(k)))){
                        hitCnt++;
                        hitTot++;
                    }
                }
                if(hitCnt > hitMax) hitMax = hitCnt;
            }
            hitCnt = 0;
        }
        
        //열 체크
        for(int j = 0; j < m; j++){
           for(int i = 0; i < n; i++){
                for(int k = 0; k < bingo[i][j].length(); k++){
                    if("9".equals(String.valueOf(bingo[i][j].charAt(k)))){
                        hitCnt++;
                    }
                }
                if(hitCnt > hitMax) hitMax = hitCnt;
            }
            hitCnt = 0;
        }
        System.out.print(hitTot - hitMax);
    }
}