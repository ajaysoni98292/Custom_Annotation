package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author ajay
 */
public class SizeConstraintValidator implements ConstraintValidator<SizeConstraint, String> {

    private int min = 0;
    private int max = 0;

    @Override
    public void initialize(SizeConstraint sizeConstraint) {
        System.out.println("============testing");
        min = sizeConstraint.min();
        max = sizeConstraint.max();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("Testing");
        try {
            if (s.trim().length() < min || s.trim().length() > max) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
