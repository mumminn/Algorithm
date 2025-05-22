import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int num;
		
		int [] arr = new int[N];
		
		for (int n = 0; n < N; n++) {
			arr[n] = n+1;
		}
		
		for (int i = 0; i < M; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			num = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = num;
		}
		for (int j = 0; j < arr.length; j++) {
			bw.write(arr[j]+ " ");
		}
		br.close();
		bw.flush();
		bw.close();
	
	}
}