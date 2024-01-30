public class Fibgenerator {
    public static int fib(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = n2 + n1;
        for(int i = n3;i<n; i++){
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return n3;
    }
    public static void main(String args[]) {
        Fibgenerator.fib((10));
    }
}