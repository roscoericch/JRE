// class A extends Thread {
//     @Override
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {
//     @Override
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }

public class ThreadsExample {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
