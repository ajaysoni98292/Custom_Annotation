package validator;

/**
 * @author ajay
 */
public class Student {

    @SizeConstraint(min=6, max=50)
    public String firstName;

    @SizeConstraint(min=4, max=50)
    public String lastName;
}
