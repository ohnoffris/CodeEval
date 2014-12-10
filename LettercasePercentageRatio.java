import java.io.*;
import java.math.BigDecimal;

public class LettercasePercentageRatio {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        float countUpper, countLower, countTotal;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            countUpper = countLower = countTotal = 0;
            line = line.trim();
            countTotal = line.length();
            for (int i = 0; i < countTotal; i++)
                if ((int) line.charAt(i) >= 65 && (int) line.charAt(i) <= 90)
                    countUpper++;
                else if ((int) line.charAt(i) >= 97 && (int) line.charAt(i) <= 122)
                    countLower++;
            System.out.println("lowercase: " + roundFloats(countLower / countTotal * 100) + " uppercase: " + roundFloats(countUpper / countTotal * 100));
        }
    }

    public static BigDecimal roundFloats(float number) {
        BigDecimal numberRound = new BigDecimal(Float.toString(number));
        numberRound = numberRound.setScale(2, BigDecimal.ROUND_HALF_UP);
        return numberRound;
    }
}
