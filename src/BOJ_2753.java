import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2753 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        // 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
        // 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
        // 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
