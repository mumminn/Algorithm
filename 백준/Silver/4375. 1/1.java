import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main{
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = br.readLine()) != null) {
            int num = Integer.parseInt(input);

            int number = 1;
            int cnt = 1;
            while (number % num != 0) {
                number = (number * 10 + 1) % num;
                cnt++;
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
    }
}