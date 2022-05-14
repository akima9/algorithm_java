import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (X > n) {
                sb.append(n).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}