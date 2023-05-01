import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class Kadai1 {

    public static void main(String args[]) {

        try(BufferedWriter writer = Files.newBufferedWriter(
            Paths.get(".","test","scores.csv"),
            StandardCharsets.UTF_8)) {
                writer.write("id,   name,   score,   date");
                writer.newLine();
                writer.write("A105, James, 75, 2023/01/05");
                writer.newLine();
                writer.write("A102, Linda, 80, 2023/01/04");
                writer.newLine();
                writer.write("A201, Gregory, 54, 2023/01/10");
                writer.newLine();
                writer.write("A110, Mike, 98, 2023/01/10");
                writer.newLine();
                writer.write("A300, Aria, 80, 2023/01/06"); 
                writer.newLine();
            }catch(IOException e) {
                e.printStackTrace();

            }
    }
}