/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beginner;
import java.io.*;

/**
 *
 * @author Ohnoffris
 */

public class FizzBuzz {
    public static void main(String args[]) {        
        int fizz, buzz, end;
        
        try {     
            BufferedReader in = new BufferedReader(new FileReader("src/Beginner/numbers.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split("\\s+");     
                if (lineArray.length > 0) {
                    fizz = validateFizzBuzz(Integer.valueOf(lineArray[0]));
                    buzz = validateFizzBuzz(Integer.valueOf(lineArray[1]));
                    end = validateEnd(Integer.valueOf(lineArray[2])); 
                    if (fizz != -1 && buzz != -1 && end != -1) {
                        for (int i = 1; i <= end; i++) {
                            if (i % fizz == 0 && i % buzz == 0)
                                System.out.print("FB");
                            else
                                if (i % fizz == 0)
                                    System.out.print("F");
                                else
                                    if (i % buzz == 0)
                                        System.out.print("B");
                                    else
                                        System.out.print(i);
                            if (i != end)
                                System.out.print(' ');
                        }
                    }
                    else
                        System.out.println("Numbers do not fall within the acceptable range.");
                }
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        catch (IOException e) {
            System.out.println("Error on file");
        }
    }
    
    public static int validateFizzBuzz(int num) {
        if (num < 1 || num > 20)
            return -1;
        return num;
    }   
    
    public static int validateEnd(int num) {
        if (num < 21 || num > 100)
            return -1;
        return num;                   
    }
}