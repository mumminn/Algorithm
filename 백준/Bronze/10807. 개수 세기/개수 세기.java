import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int v = Integer.parseInt(br.readLine());
		int total = 0;

		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a == v) total++;
		}
		
		System.out.println(total);
		
	}
}