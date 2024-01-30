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
        boolean check = PrimeChecker.isPrime(3);
        System.out.println(check);
    }
}
