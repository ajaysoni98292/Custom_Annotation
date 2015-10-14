package buildtimeinstrucation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author ajay
 */
public class BuildTimeComplexity {

    @Complexity(highLevel = true)
    public void sayHi() {
        System.out.println("Hello ajay!!");
    }

    public static void main(String args[]) throws Exception {

        Method[] methods = BuildTimeComplexity.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Complexity.class)) {
                Complexity complexity = method.getAnnotation(Complexity.class);
                if (complexity.highLevel()) {
                    throw new Exception("YO yo hunny singh");
                }
            }
        }
    }
}
