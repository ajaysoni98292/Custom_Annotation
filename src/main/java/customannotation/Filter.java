package customannotation;

import java.lang.annotation.*;

/**
 * @author ajay
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Filter {
    String value();
}