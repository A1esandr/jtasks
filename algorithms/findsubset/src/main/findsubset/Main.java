package findsubset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int result = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String J = r.readLine();
        String S = r.readLine();

        if (J.isEmpty() || S.isEmpty()) {
            System.out.print(result);
            return;
        }

        char[] jewelry = J.toCharArray();
        char[] rocks = S.toCharArray();
        Arrays.sort(jewelry);
        Arrays.sort(rocks);

        int start = 0;
        for(char jew : jewelry){
            for(int i = start; i < rocks.length; i++){
                if(rocks[i] == jew){
                    result++;
                } else if(rocks[i] > jew) {
                    start = i;
                    break;
                }
            }
        }

        System.out.print(result);
    }
}
