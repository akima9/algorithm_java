// 문제 URL : https://www.acmicpc.net/problem/4375
// Math.pow(a,b); a의 b승
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_4375 {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = bf.readLine()) != null) {
            int inputNum = Integer.parseInt(str);
            double i = 0;
            long tempNum = (long)Math.pow(10, i);
            int cnt = 1;
            while (tempNum % (long)inputNum != 0) {
                i++;
                tempNum += (long)Math.pow(10, i);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
