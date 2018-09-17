import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;
 
class Q14915{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<Integer>();
        
        int qu = -1, re = -1; // ¸ò, ³ª¸ÓÁö
        
        for(;;){
            qu = m / n;
            re = m % n;
            
            m = qu;
            stack.push(re);
            
            if(qu==0) break;
        }
        
        while(!stack.isEmpty()){
            int temp = stack.pop();
            switch(temp){
                case 0 : System.out.print(temp); break;
                case 1 : System.out.print(temp); break;
                case 2 : System.out.print(temp); break;
                case 3 : System.out.print(temp); break;
                case 4 : System.out.print(temp); break;
                case 5 : System.out.print(temp); break;
                case 6 : System.out.print(temp); break;
                case 7 : System.out.print(temp); break;
                case 8 : System.out.print(temp); break;
                case 9 : System.out.print(temp); break;
                case 10 : System.out.print("A"); break;
                case 11 : System.out.print("B"); break;
                case 12 : System.out.print("C"); break;
                case 13 : System.out.print("D"); break;
                case 14 : System.out.print("E"); break;
                case 15 : System.out.print("F"); break;
            }
        }
    }
}