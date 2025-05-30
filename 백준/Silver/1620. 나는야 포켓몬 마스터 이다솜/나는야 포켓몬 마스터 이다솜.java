import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> hashmap = new HashMap<>();
		
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String num = Integer.toString(i+1);
			
			hashmap.put(str, num);
			hashmap.put(num, str);
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(hashmap.get(br.readLine()));
		}
		
	}
}