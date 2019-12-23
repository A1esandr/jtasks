package main.removeduplicates;

import java.io.*;

public class MainIntFileSb {
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
        int last = 0;
        int lastValue = Integer.parseInt(r.readLine());
        int next;
        StringBuilder sb = new StringBuilder();
        sb.append(lastValue);
        sb.append("\n");
        for(int i = 1; i < sizeInt; i++){
            next = Integer.parseInt(r.readLine());
            if (next > lastValue){
                if(last == 100){
                    writer.write(sb.toString());
                    sb = new StringBuilder();
                    last = -1;
                }
                sb.append(next);
                sb.append("\n");
                ++last;
                lastValue = next;
            }
        }

        writer.write(sb.toString());
        writer.close();
    }
}
