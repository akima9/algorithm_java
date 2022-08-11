import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ_1406 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ListIterator<Character> iter = list.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < M; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0].charAt(0)) {
                case 'L':
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    iter.add(cmd[1].charAt(0));
                    break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Character chr : list) {
            bw.write(chr);
        }
        bw.flush();
        bw.close();
    }
}