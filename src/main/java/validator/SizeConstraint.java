package validator;

import java.lang.annotation.*;

/**
 * @author ajay
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SizeConstraint {


}
