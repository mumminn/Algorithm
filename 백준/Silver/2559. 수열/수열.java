import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int [] tempArr = new int [n];
	
		for (int i = 0; i < n; i++) {
			tempArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += tempArr[i];
		}
		
		int max = sum;
		
		for (int i = k; i < n; i++) {
			sum = sum - tempArr[i-k]+ tempArr[i];
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}
}