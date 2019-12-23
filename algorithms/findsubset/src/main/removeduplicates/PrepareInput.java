package removeduplicates;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrepareInput {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }

        String fileContent = "11\n2\n2\n3\n6\n6\n6\n77\n88\n89\n89\n89\n";

        BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
        writer.write(fileContent);
        writer.close();
    }
}
