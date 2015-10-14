package buildtimeinstrucation;

import java.lang.annotation.*;

/**
 * @author ajay
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Complexity {

    boolean highLevel() default false;
}