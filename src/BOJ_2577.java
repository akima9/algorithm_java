import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        long M = A * B * C;
        int[] arr = new int[10];
        String m = Long.toString(M);
        String[] splitM = m.split("");
        for (int i = 0; i < splitM.length; i++) {
            arr[Integer.parseInt(splitM[i])] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
