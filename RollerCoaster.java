package Beginner;

import java.io.*;

public class RollerCoaster {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line, phrase;
        int numLetter;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            phrase="";
            numLetter=0;
            for (int i = 0; i < line.length(); i++) {
                if(Character.isLetter(line.charAt(i)))
                    phrase+=rollerCoaster(line.charAt(i), numLetter++);
                else
                    phrase+=line.charAt(i);
            }
            System.out.println(phrase);
        }
    }

    public static char rollerCoaster(char c, int n) {         
            if (n % 2 == 0) //even-uppercase            
                return Character.toUpperCase(c);
             else //odd-lowercase            
                return Character.toLowerCase(c);
    }
}
