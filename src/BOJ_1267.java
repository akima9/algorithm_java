import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1267 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = 0;
        int M = 0;
        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(st.nextToken());
            int tempY = t;
            int tempM = t;

            if (t > 0) {
                Y += 10;
                M += 15;
            }

            while ((tempY - 30) >= 0) {
                Y += 10;
                tempY -= 30;
            }//end while

            while ((tempM - 60) >= 0) {
                M += 15;
                tempM -= 60;
            }//end while
        }//end for

        StringBuilder sb = new StringBuilder();
        if (Y > M) {
            sb.append("M ").append(M);
        } else if (Y < M) {
            sb.append("Y ").append(Y);
        } else {
            sb.append("Y M ").append(Y);
        }

        System.out.println(sb.toString());

    }
}