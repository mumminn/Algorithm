import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		
		for (int i=0; i < num; i++) {
			String s = br.readLine();
			
			String reversed = new StringBuilder(s).reverse().toString();
			
			if (set.contains(reversed) || s.equals(reversed)) {
				int len = s.length();
				System.out.println(len+" "+s.charAt(len/2));
				return;
			}
			
			set.add(s);
		}
		
	}
}