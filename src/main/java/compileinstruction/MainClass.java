package compileinstruction;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

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

        Class<Student> studentClass = Student.class;
        Method[] methods = studentClass.getMethods();
        new ArrayList<>(Arrays.asList(methods)).forEach(method -> System.out.println(method.getName()));
    }
}
