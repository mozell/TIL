import java.util.Scanner;
import java.util.ArrayList;

public class Q2606 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = sc.nextInt();
		int edge = sc.nextInt();
		
		ArrayList<Integer> network[] = new ArrayList[edge];
		for(int i=0; i<edge; i++) {
			network[i] = new ArrayList<Integer>(); 
		}

		
		int n = sc.nextInt();
		int m = sc.nextInt();
		network[0].add(n);
		network[0].add(m);
		
		for(int i = 1; i < edge; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			for(int j = 0; j < edge; j++) {
				if(network[j].contains(n)) {
					if(!network[j].contains(m))
						network[j].add(m);
					break;
				}
				else if(network[j].contains(m)) {
					if(!network[j].contains(n))
						network[j].add(n);
					break;
				}
				//처음들어왓넹? 그러면 빈 네트워크에다가  채우자
				else {
					for(int k = 0; k < edge; k++) {
						if(network[k].isEmpty()) {
							network[k].add(n);
							network[k].add(m);
							break;
						}
					}
				}
			}
		}
		
		for(int i = 0; i<edge; i++) {
			if(network[i].contains(1)) {
				System.out.println(network[i].size()-1);
			}
			else
				System.out.println("0");
		}
		sc.close();
		
	}
}

