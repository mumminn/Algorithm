import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] arr = new int [30];
		
		for (int i = 0; i < 30; i++) {
			arr[i] = i+1;
		}
		
		for (int j = 0; j < 28; j++) {
			int n = Integer.parseInt(br.readLine());
			arr[n-1] = 0;
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] != 0) {
				bw.write(arr[k]+"\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}