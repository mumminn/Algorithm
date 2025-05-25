import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr [] = new int [N];
		
		for (int n = 0; n < arr.length; n++) {
			arr[n] = n + 1;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			while(I < J) {
				int temp = arr[J-1];
				arr[J-1] = arr[I-1];
				arr[I-1] = temp;
				I++;
				J--;
			}
			
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}
}