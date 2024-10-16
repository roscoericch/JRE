class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

class Hello {
    public static void main(String args[]) {
        int num = 5;
        int num2 = 0b0101;
        int zeroInt = 0;
        int num3 = num + num2;
        byte by = 127;
        int[] arr = new int[5];
        arr[2] = 1;
        // boolean state = true;
        // char lang = 't';
        System.out.println(by);
        // System.out.println(a);
        try {
            System.err.println(arr[5]);
            num3 = num/zeroInt;
            System.out.println(num3);
            throw new CustomException("custom exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello world");
        String a = "Thursday";
        String currentDay = switch (a) {
            case "Monday" -> "Today";
            case "Tuesday" -> "Tomorrow";
            case "Wednesday" -> "In two days";
            case "Thursday" -> "In three days";
            case "Friday" -> "In four days";
            default -> "In five days";
        };
        System.out.println(currentDay);
        int i = 0;
        while(i<=4){
            System.out.println("current" + i + i++);
            i++;
        };
        // Integer,Character,Boolean,Float
    }
}