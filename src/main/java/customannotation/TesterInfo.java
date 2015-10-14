package customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ajay
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TesterInfo {

    enum Priority  {
        LOW, MEDIUM, HIGH
    }

    Priority priority() default Priority.MEDIUM;

    String[] tags() default "";

    String createdBy() default "ajay";
}
