package validator;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author ajay
 */
public class PerformValidation {



    public static void main(String args[]) {

        Student student = new Student();
        student.firstName = "ajay";
        student.lastName = "soni";

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        validator.validate(student);
    }
}
