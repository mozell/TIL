import java.util.Scanner;
import java.util.Stack;

public class Q10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int tc = sc.nextInt();
		
		for(int i = 0; i < tc; i++) {
			String command = sc.next();
			//System.out.println(command);
			
			if(command.equals("push")) {
				int pushx = sc.nextInt();
				st.push(pushx);
			}
			else if(command.equals("pop")) {
				if(!st.isEmpty()) {
					int pop = st.pop();
					System.out.println(pop);
				}
				else System.out.println("-1");
			}
			else if(command.equals("size")) {
				int size = st.size();
				System.out.println(size);
			}
			else if(command.equals("empty")) {
				if(st.isEmpty()) System.out.println("1");
				else System.out.println("0");
			}
			else if(command.equals("top")) {
				if(st.isEmpty()) System.out.println("-1");
				else System.out.println(st.get(st.size()-1));
			}
		}
		
	}
}
