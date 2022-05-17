import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
        // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
        // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
        if (a == b && a == c & b == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b) {
            System.out.println(1000 + (a * 100));
        } else if (a == c) {
            System.out.println(1000 + (a * 100));
        } else if (b == c) {
            System.out.println(1000 + (b * 100));
        } else {
            if (a > b && a > c){
                System.out.println(a * 100);
            } else if (b > a && b > c) {
                System.out.println(b * 100);
            } else if (c > a && c > b) {
                System.out.println(c * 100);
            }
        }
    }
}
