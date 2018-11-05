package postCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostCodeValidator implements ConstraintValidator<PostalCode, String> {
    @Override
    public void initialize(PostalCode constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        System.out.println("Current value to check is"+ s);
        if(s.isEmpty()) return false;
        return true;
    }
}
