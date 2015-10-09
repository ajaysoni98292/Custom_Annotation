package compileinstruction;

/**
 * @author ajay
 */

public class Student extends Info {

    @Deprecated
    public static String firstName = "Testing";

    /**
     * This method is deprecated. Use sayHi instead.
     */
    @Deprecated
    public static void display() {
        System.out.println("Hi Ajay !!");
    }

    public static void display2() {
        System.out.println("Hi Soni !!");
    }

    public static void sayHi(String name) {
        System.out.println("Hi " + name + " !!");
    }

    public void show() {
        System.out.println("Override show method");
    }
}
