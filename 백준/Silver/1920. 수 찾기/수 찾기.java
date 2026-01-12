import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Set <Integer> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			set.add(a);
		}
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<m; i++) {
			int num = Integer.parseInt(str.nextToken());
			if (set.contains(num)) {
				sb.append(1 + "\n");
			} else {
				sb.append(0 + "\n");
			}
		}	
		
		System.out.println(sb);
	}
}