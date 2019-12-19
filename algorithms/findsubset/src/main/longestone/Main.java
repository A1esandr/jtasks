package main.longestone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String size = r.readLine();
        int sizeInt = Integer.parseInt(size);
        String one = "1";
        int counter = 0;
        for(int i = 0; i < sizeInt; i++){
            String next = r.readLine();
            if (next.equals(one)){
                ++counter;
                if (counter > result){
                    result = counter;
                }
            } else {
                counter = 0;
            }
        }

        System.out.println(result);
    }
}
