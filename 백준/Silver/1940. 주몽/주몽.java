import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int [] arr = new int [n];
		int num = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (j == i) {
					continue;
				}
				else {
					if (arr[i] + arr[j] == m) {
						num++;
					}
				}
			}
		}
		
		System.out.println(num / 2);
		
		
		}
}