class Calculator {
    public int add(int a, int b){
        return a + b;
    };
    public int subtract(int a, int b){
        return a - b;
    }
}

public class Device {
 public static void main(String a[]){
    int num1 = 5;
    int num2 = 7;
    Calculator calc = new Calculator();
    int resultAdd = calc.add(num1, num2);
    int resultDiff = calc.subtract(num1, num2);
    System.out.println(resultAdd);
    System.out.println(resultDiff);
 }
}