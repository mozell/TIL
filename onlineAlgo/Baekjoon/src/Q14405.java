import java.util.Scanner;
import java.util.ArrayList;


public class Q14405 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		int cnt = 0;
		ArrayList indexList = new ArrayList();
		
		// pi delete
		for(int i = 0; i < s.length()-1 ; i++) {
			if(s.charAt(i)=='p' && s.charAt(i+1) =='i') {
				cnt = cnt+1;
				indexList.add(i);
			}	
		}
		for(int j = cnt; j > 0; j--) {
			int index = (int) indexList.get(j-1);
			String b = s.substring(0, index);
			String a = s.substring(index+2, s.length());
			s = b+"."+a;
		}
		cnt = 0;
		indexList.clear();
		
		
		
		// ka delete
		for(int i = 0; i < s.length()-1 ; i++) {
			if(s.charAt(i)=='k' && s.charAt(i+1) =='a') {
				cnt = cnt+1;
				indexList.add(i);
			}	
		}

		for(int j = cnt; j > 0; j--) {
			int index = (int) indexList.get(j-1);
			String b = s.substring(0, index);
			String a = s.substring(index+2, s.length());
			s = b+"."+a;
		}
		cnt = 0;
		indexList.clear();
		
		
		
		// chu delete
		for(int i = 0; i < s.length()-2 ; i++) {
			if(s.charAt(i)=='c' && s.charAt(i+1) =='h' && s.charAt(i+2) =='u') {
				cnt = cnt+1;
				indexList.add(i);
			}	
		}

		for(int j = cnt; j > 0; j--) {
			int index = (int) indexList.get(j-1);
			String b = s.substring(0, index);
			String a = s.substring(index+3, s.length());
			s = b+"."+a;
		}
		
		
		s = s.replace(".", "");
		System.out.println(s);
		
		if(s.isEmpty())
			System.out.println("YES");
		
		else
			System.out.println("NO");
	}
}

/**
		// chu delete
		for(int i = 0; i < s.length()-2 ; i++) {
			if(s.charAt(i)=='c' && s.charAt(i+1) =='h' && s.charAt(i+2) =='u') {
				System.out.println("bef chu>> "+s);
				String b = s.substring(0, i);
				String a = s.substring(i+3, s.length());
				s = b+a;
				System.out.println("aft chu> "+s);
				System.out.println("3");
			}	
		}

 **/