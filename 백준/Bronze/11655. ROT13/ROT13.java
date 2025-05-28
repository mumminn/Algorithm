import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!Character.isLetter(ch)) {
				sb.append(ch);
				continue;
			}
			
			int n = (int)ch + 13;
			
			if(Character.isUpperCase(ch) && n > 90) {
				n -= 26;
			}
			
			if(Character.isLowerCase(ch) && n > 122) {
				n -= 26;
			}
			
			sb.append((char)n);
		}
		
		System.out.println(sb);
		
	}
}