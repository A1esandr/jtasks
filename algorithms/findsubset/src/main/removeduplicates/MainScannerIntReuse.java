package main.removeduplicates;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MainScannerIntReuse {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        File outfile = new File("output.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(outfile), 15);

        Scanner r = new Scanner(file);
        int sizeInt = r.nextInt();
        if (sizeInt == 0){
            writer.write("\n");
            writer.close();
            return;
        }
        int[] ints = new int[100];
        int last = 0;
        int next = r.nextInt();
        ints[last] = next;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < sizeInt; i++){
            next = r.nextInt();
            if (next > ints[last]){
                if(last == 99){
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
