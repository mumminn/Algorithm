import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		String a = st.nextToken();
		int p = Integer.parseInt(st.nextToken());
		int indexNum;
		
		list.add(Integer.parseInt(a));

		while(true) {
			int result = 0;			
			for (int i = 0; i < a.length(); i++) {
				result += (int) Math.pow((a.charAt(i)-'0'), p);
			}
						
			if(list.contains(result)) {
				indexNum = list.indexOf(result);
				break;
			}
			
			list.add(result);
			a = String.valueOf(result);

		}
		
		System.out.println(indexNum);
		
	}
}
