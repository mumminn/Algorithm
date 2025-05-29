import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), "*");
		String start = st.nextToken();
		String end = st.nextToken();
		
		
		
		for (int i = 0; i < N; i++) {
			
			String target = br.readLine();
			
			if (target.length() < start.length() + end.length()) {
				System.out.println("NE");
				continue;
			}
			
			String startTarget = target.substring(0, start.length());
			String endTarget = target.substring(target.length()-end.length(), target.length());
			
			
			if(start.equals(startTarget) && end.equals(endTarget)) {
				System.out.println("DA");
			}
			
			else {
				System.out.println("NE");
			}
		}
	}
}