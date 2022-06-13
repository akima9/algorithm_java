import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2309 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        int A = 0;
        int B = 0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }//end for
        
        int a = sum - 100;
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == a){
                    A = arr[i];
                    B = arr[j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == A || arr[i] == B) {
                continue;
            }
            System.out.println(arr[i]);
        }
        
    }
}
