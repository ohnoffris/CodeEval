import java.io.*;
public class NModM {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[]values;
        int[]numbers = new int[2];
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            values = line.split(",");
            for(int i=0;i<values.length;i++)
                numbers[i]=Integer.valueOf(values[i]);
            while(numbers[0]>=numbers[1])
                numbers[0]-=numbers[1];
            System.out.println(numbers[0]);
        }
    }
}
