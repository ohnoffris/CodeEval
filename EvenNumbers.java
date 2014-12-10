import java.io.*;
public class EvenNumbers {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int num=Integer.valueOf(line);
            System.out.println(num%2==0?1:0);
        }
    }
}
