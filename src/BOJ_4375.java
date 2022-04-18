import java.util.Scanner;

public class BOJ_4375 {
    public static void main(String[] args) throws Exception {
        // 문제 URL : https://www.acmicpc.net/problem/4375

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int reqNum = sc.nextInt();
            double i = 0;
            long tempNum = (long)Math.pow(10, i);
            int cnt = 1;
            while (tempNum % (long)reqNum != 0) {
                i++;
                tempNum += (long)Math.pow(10, i);
                cnt++;
            }
            System.out.println(cnt);   
        }
    }
}
