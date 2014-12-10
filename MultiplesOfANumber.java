import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numbersRaw = line.split(",");
            int x = Integer.valueOf(numbersRaw[0]);
            int n = Integer.valueOf(numbersRaw[1]);
            for (int i = 1;; i++) {
                int prod = i * n;
                if (isDivisible(prod, n) == true && prod > x) {
                    System.out.println(prod);
                    break;
                }
            }
        }
    }

    public static boolean isDivisible(int a, int b) {
        while (a >= b)
            a -= b;        
        return a == 0;
    }
}
