/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beginner;

import java.io.*;

/**
 *
 * @author Admin
 */
public class FibonacciSeries {
    public static void main(String[] args){
        File file = new File(args[0]);
        //File file = new File("src/Beginner/dates.txt"); 
        try {        
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split("\\s");
                if (lineArray.length > 0) { 
                    for (int i = 0; i < lineArray.length; i++)
                        System.out.println(fib(Integer.valueOf(lineArray[i])));
                } 
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        catch (IOException e) {
            System.out.println("Error on file");
        }
    }
    
    public static int fib(int n) {
        if (n < 2) 
            return n;
        else {
            return fib(n-1)+fib(n-2);
        }        
    }
}