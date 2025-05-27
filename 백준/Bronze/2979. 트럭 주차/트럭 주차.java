import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int [] inArray = new int [3];
		int [] outArray = new int [3];
		
		int [] time = new int [100];
		
		int one = 0, two = 0, three = 0;
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			inArray[i] = Integer.parseInt(st.nextToken());
			outArray[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = inArray[i]; j < outArray[i]; j++) {
				time[j-1]++;
			}
		}
		
		for (int i = 0; i < 100; i++) {
			
			if (time[i] == 1) {
				one++;
			}
			else if (time[i] == 2) {
				two++;
			}
			else if (time[i] == 3) {
				three++;
			}
		}
		System.out.println(one * a + two * b * 2 + three * c * 3);
				
	}
}