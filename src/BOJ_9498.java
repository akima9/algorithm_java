import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9498 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        if (90 <= a) {
            System.out.println('A');
        } else if (80 <= a && a < 90) {
            System.out.println('B');
        } else if (70 <= a && a < 80) {
            System.out.println('C');
        } else if (60 <= a && a < 70) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
