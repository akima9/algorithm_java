import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1475 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] splitN = N.split("");
        int[] num = new int[10];
        for (int i = 0; i < splitN.length; i++) {
            splitN[i] += 1;
        }
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(num[i], max);
        }
        if (num[6-1] ) {
            
        }

    }
}
