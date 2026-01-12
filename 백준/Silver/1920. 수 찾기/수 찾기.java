import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Map <Integer, Integer> hashMap = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			int num = Integer.parseInt(str.nextToken());
			if (hashMap.containsKey(num)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}	
	}
}