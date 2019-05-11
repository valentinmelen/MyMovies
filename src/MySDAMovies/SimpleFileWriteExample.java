package MySDAMovies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SimpleFileWriteExample {
    public static void main(String[] args) {
        String relativePath = "out.txt";

        File file = new File(relativePath);
        try{
            String message = "message 1";
           String message2 = "message 2";
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.write(message2);
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
