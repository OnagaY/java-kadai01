import java.ino.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;

class Kadai2 {

    public static void main(String args[]) {

        String a = "id";
        String b = "A105";
        String c = "A102";
        String d = "A201";
        String i = "A110";
        String f = "A300";

        String a1 = "name";
        String b1 = "James";
        String c1 = "Linda";
        String d1 = "Gregory";
        String e1 = "Mike";
        String f1 = "Aria";

        String a2 = "score";
        String b2 = "75";
        String c2 = "80";
        String d2 = "54";
        String e2 = "98";
        String f2 = "80";

        String a3 = "date";
        String b3 = "2023/01/05";
        String c3 = "2023/01/04";
        String d3 = "2023/01/10";
        String e3 = "2023/01/10";
        String f3 = "2023/01/06";

        List<String> ls = new ArrayList<>();
        List<String> ls1 = new ArrayList<>();
        List<String> ls2 = new ArrayList<>();
        List<String> ls3 = new ArrayList<>();

        ls.add(a);
        ls.add(b);
        ls.add(c);
        ls.add(d);
        ls.add(i);
        ls.add(f);

        ls1.add(a1);
        ls1.add(b1);
        ls1.add(c1);
        ls1.add(d1);
        ls1.add(e1);
        ls1.add(f1);

        ls2.add(a2);
        ls2.add(b2);
        ls2.add(c2);
        ls2.add(d2);
        ls2.add(e2);
        ls2.add(f2);

        ls3.add(a3);
        ls3.add(b3);
        ls3.add(c3);
        ls3.add(d3);
        ls3.add(e3);
        ls3.add(f3);

        try(BufferedWriter writer = Files.newBufferedWriter(
               Paths.get(".","test","scores.csv"),
                StandardCharsets.UTF_8)) {
                    writer.write(ls2,ls,ls1,ls3);
                    writer.newLine();
                }catch(IOException e) {
                    e.printStackTrace();



        }
  }
}