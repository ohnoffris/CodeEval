import java.io.*;
public class HappyNumbers {

    public static void main(String args[]) throws Exception {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int number, test;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            number = Integer.parseInt(line);
            while ((test = happy(number)) / 10 != 0)
                number = test;       
            System.out.println(test == 1?1:0);
        }
    }

    public static int happy(int n) {
        if (n / 10 == 0) {
            return n * n;
        } else {
            return (int) Math.pow(n % 10, 2) + happy(n / 10);
        }
    }
}
