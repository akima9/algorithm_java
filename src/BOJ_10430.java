import java.util.Scanner;

public class BOJ_10430 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] reqStrArr = sc.nextLine().split(" ");

        int A = Integer.parseInt(reqStrArr[0]);
        int B = Integer.parseInt(reqStrArr[1]);
        int C = Integer.parseInt(reqStrArr[2]);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
