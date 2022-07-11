import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1919 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int[] A = new int[26];
        int[] B = new int[26];

        for (char i : a) {
            A[i - 'a']++;
        }

        for (int i : b) {
            B[i - 'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(A[i] - B[i]);
        }
        System.out.println(cnt);
    }
}
