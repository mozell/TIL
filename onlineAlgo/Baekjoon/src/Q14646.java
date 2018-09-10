import java.util.StringTokenizer;
import java.io.*;

class Q14646{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean[] menus = new boolean[100001];
        
        int cnt = 0, max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int menu;
        
        while(st.hasMoreTokens()){
            menu = Integer.parseInt(st.nextToken());
            if(!menus[menu]) {
                menus[menu] = true;
                cnt++;
            }
            else cnt--;
            if(cnt > max) max = cnt;
        }
        System.out.print(max);
    }
}