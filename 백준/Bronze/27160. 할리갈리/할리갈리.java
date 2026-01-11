import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String fruit = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			hashMap.put(fruit, hashMap.getOrDefault(fruit, 0) + num);
		}
		
		for(String key : hashMap.keySet()) {
			if(hashMap.get(key) == 5) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
		
	}
}