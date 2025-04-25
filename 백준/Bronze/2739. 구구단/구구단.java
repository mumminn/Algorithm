import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		
		for (int i=1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}