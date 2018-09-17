import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Q14911{
    public static void main(String[] args) throws Exception{
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n2 = Integer.parseInt(br.readLine());

        int[] n1 = new int[st.countTokens()];
        for(int i = 0; i < n1.length; i++) n1[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n1.length-1; i++){
            for(int j = i+1; j < n1.length; j++){
                if(n1[i]+n1[j] == n2){
                    tm.put(n1[i], n1[j]);
                    if(tm.containsKey(n1[j]) && tm.get(n1[j]) == n1[i] && n1[i] != tm.get(n1[i])) tm.remove(n1[i]);
                    // 일단 넣고, (a, b) (b, a) 쌍 제거, (a, a) 쌍은 살림
                }
            }
        }
        
        //출력
        for(int i = 0; i < tm.size(); i++){
            int temp = tm.firstKey();
            if(i == 0){
                System.out.println(tm.firstKey()+" "+tm.get(tm.firstKey()));
            }
            else{
                System.out.println(tm.higherKey(temp)+" "+tm.get(tm.higherKey(temp)));
                temp = tm.higherKey(temp);
            }
        }
        System.out.print(tm.size());
    }
}