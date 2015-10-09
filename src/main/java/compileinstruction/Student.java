package compileinstruction;

/**
 * @author ajay
 */

public class Student {

    @Deprecated
    private static String firstName = "Testing";

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

    public static void main(String args[]) {

        Student.display(); // it giving only warning
        Student.display2();
        System.out.println(Student.firstName);
    }

}
