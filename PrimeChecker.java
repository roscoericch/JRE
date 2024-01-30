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
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
        boolean check = PrimeChecker.isPrime(n);
        System.out.println(check);
    }
}
