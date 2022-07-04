import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1475 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] splitN = N.split("");
        int[] num = new int[10];
        int max = 0;
        
        for (int i = 0; i < splitN.length; i++) {
            int index = Integer.parseInt(splitN[i]);
            if (index == 6) {
                if (num[index] > num[9]) {
                    num[9] += 1;
                } else {
                    num[index] += 1;
                }
            } else if (index == 9) {
                if (num[index] > num[6]) {
                    num[6] += 1;
                } else {
                    num[index] += 1;
                }
            } else {
                num[index] += 1;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }

        System.out.println(max);

    }
}
