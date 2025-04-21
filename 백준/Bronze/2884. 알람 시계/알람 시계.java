import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int m;
		
		m = M-45;
		
		if(m<0) {
			if(H==0) {
				System.out.println("23 "+(60-45+M));
			}	
			else System.out.println((H-1)+" "+(60-45+M));
		}
	
		else System.out.println(H+" "+m);
	}
}
	