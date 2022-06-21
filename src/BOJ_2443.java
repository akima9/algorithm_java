import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2443 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = N; i > 0; i--) {
            for (int j = i; j < N; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
