/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beginner;
import java.io.*;
/**
 *
 * @author Admin
 */
public class DataRecovery {
    public static void main(String[] args) {
        String words, numbers;
        String[] unorderedWords, orderedWords;
        int[] order;
     //   File file = new File(args[0]);
        File file = new File("src/Beginner/text.txt"); 
        try {
        
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split(";");
                if (lineArray.length > 0) {
                    words = lineArray[0];
                    numbers = lineArray[1];
                    unorderedWords = convertArrays(words);
                    order = convertArrayToInt(convertArrays(numbers));
                    orderedWords = new String[unorderedWords.length];
                    for (int i = 0; i < order.length; i++){
                        orderedWords[(order[i])-1] = unorderedWords[i];
                    }
                    for (int i = 0; i < orderedWords.length; i++)
                        if (orderedWords[i] == null)
                            orderedWords[i] = unorderedWords[unorderedWords.length-1];
                    for (int i = 0; i < orderedWords.length; i++)
                        System.out.print(orderedWords[i] +" ");
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
    
    public static String[] convertArrays(String string) {
        String[] convertedArray = string.split("\\s+");
        if (convertedArray.length > 0) {
            return convertedArray;
        }
        return null;
    }
    
    public static int[] convertArrayToInt(String[] arrayString) {
        int[] convertedArray = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++)
            convertedArray[i] = Integer.valueOf(arrayString[i]);
        return convertedArray;
    }    
}