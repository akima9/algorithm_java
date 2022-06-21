import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2562 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int row = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                row = i+1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(row);
        System.out.println(sb);
    }
}
