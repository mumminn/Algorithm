import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			
			int index = (int)(str.charAt(i)) - 'A';
			arr[index]++;
			
		}
		
		int odd = 0;
		char mid = 0;
		String end;
		int oddNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd++;
				oddNum = i;
			}
		}
		
		if (odd > 1) {
			bw.write("I'm Sorry Hansoo");
			bw.flush();
			return;
		}
		
		for(int i = 0; i < 26; i++) {	
			for (int j = 0; j < arr[i]/2; j++) {
				sb.append((char)(i + 'A'));
			}
		}
		
		String front = sb.toString();
		
		if (odd == 1) {
			front += (char)(oddNum + 'A');
		}
		
		end = sb.reverse().toString();

		bw.write(front + end);
		bw.flush();
		
	}
}