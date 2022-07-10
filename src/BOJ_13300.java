import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_13300 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[6][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st2.nextToken());
            int Y = Integer.parseInt(st2.nextToken());
            arr[Y-1][S] += 1;
        }

        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                int temp = arr[i][j];
                if (temp % K != 0) {
                    cnt++;
                }
                while (temp / K > 0) {
                    temp = temp / K;
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);

    }
}
