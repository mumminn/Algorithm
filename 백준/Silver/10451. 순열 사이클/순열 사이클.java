import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	
	static int N;
	static StringBuilder sb = new StringBuilder();
	static int arr[][];
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int cycle = 0;
			N = Integer.parseInt(br.readLine());
			
			arr = new int[N+1][N+1];
			visited = new boolean[N+1];

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 1; i < N+1; i++) {
				int node = Integer.parseInt(st.nextToken());
				arr[i][node] = 1;
			}
			
			for(int i = 1; i < N+1; i++) {
				if(!visited[i]) {
					dfs(i);
					cycle++;
				}
			}
			sb.append(cycle);
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	static void dfs(int start) {
		visited[start] = true;
		
		for(int i = 1; i < N+1; i++) {
			if(arr[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
}