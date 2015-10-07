package customannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ajay
 */
public class RunTest {

    public static void main(String args[]) {

        int passed = 0, failed = 0, count = 0, ignore = 0;

        Class<TestExample> testExampleClass = TestExample.class;

        if (testExampleClass.isAnnotationPresent(TesterInfo.class)) {
            Annotation annotation = testExampleClass.getAnnotation(TesterInfo.class);
            TesterInfo testerInfo = (TesterInfo) annotation;
            // injecting the behavior
            System.out.println(testerInfo.createdBy());
            System.out.println(testerInfo.priority());
            String[] tags = testerInfo.tags();
            (new ArrayList<>(Arrays.asList(tags))).forEach(s -> System.out.println("tags :" + s));
        }

        for (Method method : testExampleClass.getDeclaredMethods()) {

            // if method is annotated with @Test
            if (method.isAnnotationPresent(Test.class)) {

                Annotation annotation = method.getAnnotation(Test.class);
                Test test = (Test) annotation;

                // if enabled = true (default)
                if (test.enabled()) {
                    try {
                        method.invoke(testExampleClass.newInstance());
                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
                        failed++;
                    }
                } else {
                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                    ignore++;
                }
            }
        }
        System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);

    }
}
