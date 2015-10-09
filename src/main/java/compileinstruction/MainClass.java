package compileinstruction;

/**
 * @author ajay
 */
public class MainClass {

    public static void main(String args[]) {

        // use of the deprecated annotation
        Student.display(); // it giving only warning
        Student.display2();
        System.out.println(Student.firstName);

        // override annotation benefits
        Student student = new Student();
        student.show1();

    }
}
