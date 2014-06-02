/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beginner;

/**
 *
 * @author Admin
 */
public class SumOfPrimes {
    public static void main(String[] args) {
        int sumPrimes = 1, count = 0, i = 0;
           
        while (count < 1000) {
            if(isPrime(i)) {   
                sumPrimes+=i;
                count++;
            }
            i++;   
        }
        System.out.println(sumPrimes);
    }    
    
    public static boolean isPrime(int n) {
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }    
}