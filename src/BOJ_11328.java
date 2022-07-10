import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11328 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        String result = "Possible";
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String[] A = a.split("");
            String b = st.nextToken();
            String[] B = b.split("");
            Arrays.sort(A);
            Arrays.sort(B);
            if (Arrays.equals(A, B)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
        
    }
}
