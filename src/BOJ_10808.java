import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10808 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 97] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
