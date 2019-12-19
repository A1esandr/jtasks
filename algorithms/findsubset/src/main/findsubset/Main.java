package findsubset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer result = 0;
        if (args.length < 2) {
            System.out.print(result);
            return;
        }

        if (args[0].isEmpty() || args[1].isEmpty()) {
            System.out.print(result);
            return;
        }

//        System.out.println(args[0]);
//        System.out.println(args[1]);

        char[] jewelry = args[0].toCharArray();
        char[] rocks = args[1].toCharArray();
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
