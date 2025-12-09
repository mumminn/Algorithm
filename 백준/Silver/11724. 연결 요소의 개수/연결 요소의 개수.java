import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main{
	
	static int[][] map;
	static boolean[] visited;
	static int N, M;
	static int count = 0;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		visited = new boolean[N];

		for (int i = 0; i < M; i++) {
						
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			map[a-1][b-1] = map[b-1][a-1] = 1;
			
		}
		
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static void dfs(int x) {
		visited[x] = true;
		
		for (int i = 0; i < N; i++) {
			if(!visited[i] && map[x][i]==1) {
				dfs(i);
			}
		}
	}
}