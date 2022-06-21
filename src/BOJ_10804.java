import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10804 {
    public static void main(String[] args) throws Exception{
        int[] card = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int start = a - 1;
            int startIndex = a - 1;
            int end = b -1 ;
            int endIndex = b -1 ;
            int temp = 0;
            int cnt = 0;
            while (startIndex <= endIndex) {
                temp = card[start + cnt];
                card[start + cnt] = card[end - cnt];
                card[end - cnt] = temp;
                cnt++;
                startIndex++;
                endIndex--;
            }//end while
        }//end for

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < card.length; i++) {
            sb.append(card[i]).append(" ");
        }
        System.out.println(sb);
    }
}
