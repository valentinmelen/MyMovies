package MySDAMovies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SimpleFileReadExample {
    public static void main(String[] args) {
        String absolutePath = "E:\\SD_Academy\\week6\\movies.txt";
        String relativePath = "movies.txt";

        File file = new File(relativePath);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        try {
            FileReader fileReader = new FileReader(file);//citesc caracter cu caracter
            BufferedReader bufferedReader = new BufferedReader(fileReader);//citesc blocuri de caractere, citesc linie cu linie
            String line= bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);//afisez linia
                line = bufferedReader.readLine();//citesc urmatoarea linie
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
