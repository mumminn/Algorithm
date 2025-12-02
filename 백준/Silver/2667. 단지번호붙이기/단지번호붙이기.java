import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main{
	
	private static int dx[] = {0, 0, -1, 1};
	private static int dy[] = {-1, 1, 0, 0};
	private static int n;
	private static int[][] map;
	private static boolean[][] visited;
	private static int count = 0; // 총 단지
	private static List<Integer> nums;
	private static int c;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		
		nums = new ArrayList<>();
				
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
					count++;
					nums.add(c);
					c = 0;
				}
			}
		}
		
		System.out.println(count);
		Collections.sort(nums);

		for (Integer num : nums) {
			System.out.println(num + 1);
		}
		
		
	}
	
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n) {
				if(!visited[nowX][nowY] && map[nowX][nowY] == 1) {
					dfs(nowX, nowY);
					c++;
				}
			}
		}
	}
	
}