package removeduplicates;

import java.io.*;

public class MainIntFile {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        File outfile = new File("output.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(outfile));

        BufferedReader r = new BufferedReader(new FileReader(file), 100);
        String size = r.readLine();
        int sizeInt = Integer.parseInt(size);
        if (sizeInt == 0){
            writer.write("\n");
            writer.close();
            return;
        }
        int[] ints = new int[100];
        int last = 0;
        int next = Integer.parseInt(r.readLine());
        ints[last] = next;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < sizeInt; i++){
            next = Integer.parseInt(r.readLine());
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
