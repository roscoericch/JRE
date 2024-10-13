import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n){
        boolean result = false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                result = false;
                break;
            }
            result = true;
        };
        return result;
    }
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n;
       while (true) {
        System.out.print("Enter a number : ");
        try {
            n = s.nextInt();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid Number : ");
            s.next();
        }
    } 
        boolean check = isPrime(n);
        System.out.println(check);
    }
}
