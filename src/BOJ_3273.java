import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        int x = Integer.parseInt(br.readLine());
        
        Arrays.sort(a);

        int left = 0;
        int right = n-1;
        int cnt = 0;
        while (left < right) {
            if (a[left] + a[right] == x) {
                cnt++;
                left++;
                right--;
            } else if (a[left] + a[right] > x) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(cnt);
    }
}
