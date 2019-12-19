package main.removeduplicates;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String size = r.readLine();
        int sizeInt = Integer.parseInt(size);
        String last = "";
        List<String> results = new ArrayList<>();
        for(int i = 0; i < sizeInt; i++){
            String next = r.readLine();
            if (i != 0 && next.equals(last)){
                continue;
            } else {
                last = next;
                results.add(next);
            }
        }

        for(String result : results){
            System.out.println(result);
        }
        if (results.isEmpty()){
            System.out.println();
        }
    }
}

