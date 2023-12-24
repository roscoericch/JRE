class Hello {
    public static void main(String args[]) {
        int num = 5;
        int num2 = 0b0101;
        int num3 = num + num2;
        byte by = 127;
        boolean state = true;
        char lang = 't';
        System.out.println(by);
        // System.out.println(a);
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