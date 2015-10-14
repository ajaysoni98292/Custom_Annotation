package functionalinterface;

/**
 * @author ajay
 */
public class FunctionalInterfaceImpl {

    public static void main(String args[]) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Jai mata di");
            }
        });

        thread.run();

        Thread thread1 = new Thread(() -> System.out.println("jai mata di 2"));
        thread1.run();
    }
}
