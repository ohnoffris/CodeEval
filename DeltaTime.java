import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeltaTime {
    public static void main (String[] args) throws IOException, ParseException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] datesRaw;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            datesRaw=line.split(" ");
            Date d1=format.parse(datesRaw[0]);
            Date d2=format.parse(datesRaw[1]);
            long dr=Math.abs(d1.getTime()-d2.getTime());
            System.out.println(new Date(dr).toString().split(" ")[3]);            
        }
    }
}
