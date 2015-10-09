package validator;

import validator.SizeConstraint;

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

        min = sizeConstraint.min();
        max = sizeConstraint.max();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

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
