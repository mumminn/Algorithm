import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int [26];
		
		boolean player = true;
		
		int pre = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			char firstName = str.charAt(0);
			
			int firstNum = (int)(firstName);
			
			arr[firstNum - 97]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] >= 5){
				sb.append((char)(i + 97));
				player = true;
			}
			else {
				pre++;
			}
		}
		
		if (pre == 26) {
			player = false;
		}
		
		System.out.println(player ? sb : "PREDAJA");
		
	}
}