import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int alpaArr [] = new int [26];
		
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			alpaArr[ch-97]++;
		}
		
		for (int j = 0; j < alpaArr.length; j++) {
			System.out.print(alpaArr[j]+ " ");
		}
				
	}
}