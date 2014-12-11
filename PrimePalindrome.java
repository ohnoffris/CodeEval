package Beginner;

public class PrimePalindrome {
    public static void main (String[] args) {
        int number = 0;
        for (int i = 10; i < 1000; i++)
            if (isPrime(i) && i == reverseNumber(i))
                number = i;
        System.out.println(number);
    }
    
    public static int reverseNumber(int n) {
        int reverse = 0;
            while (n != 0) {
                reverse *= 10;
                reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }
    
    private static boolean isPrime(int n) {
        if (n % 2 == 0) 
            return false;
        for (int i = 3; i*i <= n; i += 2)
            if (n % i == 0) 
                return false;
        return true;
    }
}
