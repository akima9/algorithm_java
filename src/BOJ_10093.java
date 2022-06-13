import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10093 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());
        
        if (start > end) {
            long temp = start;
            start = end;
            end = temp;
        }
        
        if (start == end) {
            System.out.println(end - start);
        } else {
            System.out.println(end - start - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (long i = start + 1; i < end; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        
    }   
}
