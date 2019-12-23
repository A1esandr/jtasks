package main.removeduplicates;

import java.io.*;
import java.util.Scanner;

public class MainIntFileScanner {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        File outfile = new File("output.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(outfile), 15);

        Scanner r = new Scanner(file);
        int sizeInt = Integer.parseInt(r.nextLine());
        if (sizeInt == 0){
            writer.write("\n");
            writer.close();
            return;
        }
        int[] ints = new int[100];
        int last = 0;
        int next = Integer.parseInt(r.nextLine());
        ints[last] = next;
        StringBuilder sb;
        for(int i = 1; i < sizeInt; i++){
            next = Integer.parseInt(r.nextLine());
            if (next > ints[last]){
                if(last == 99){
                    sb = new StringBuilder();
                    for(int a = 0; a < 100; a++){
                        sb.append(ints[a]);
                        sb.append("\n");
                    }
                    writer.write(sb.toString());
                    last = -1;
                }
                ++last;
                ints[last] = next;
            }
        }

        sb = new StringBuilder();
        if(last == 0){
            writer.write(sb.append(ints[last]).append("\n").toString());
        } else {
            ++last;
            for(int a = 0; a < last; a++){
                sb.append(ints[a]);
                sb.append("\n");
            }
            writer.write(sb.toString());
        }
        writer.close();
    }
}
