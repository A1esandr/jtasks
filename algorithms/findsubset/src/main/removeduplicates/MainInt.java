package main.removeduplicates;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainInt {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String size = r.readLine();
        int sizeInt = Integer.parseInt(size);
        if (sizeInt == 0){
            System.out.println();
            return;
        }
        int[] ints = new int[100];
        int last = 0;
        int next = Integer.parseInt(r.readLine());
        ints[last] = next;
        for(int i = 1; i < sizeInt; i++){
            next = Integer.parseInt(r.readLine());
            if (next > ints[last]){
                if(last == 99){
                    for(int a = 0; a < 100; a++){
                        System.out.println(ints[a]);
                    }
                    last = -1;
                }
                ++last;
                ints[last] = next;
            }
        }

        if(last == 0){
            System.out.println(ints[last]);
        } else {
            ++last;
            for(int a = 0; a < last; a++){
                System.out.println(ints[a]);
            }
        }
    }
}

