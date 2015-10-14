package buildtimeinstrucation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ajay
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Complexity {

    public boolean highLevel() default false;
}