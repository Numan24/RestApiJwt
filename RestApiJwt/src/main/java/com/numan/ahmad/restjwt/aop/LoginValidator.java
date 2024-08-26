package com.numan.ahmad.restjwt.aop;

import com.numan.ahmad.restjwt.model.Users;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Users.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Users user = (Users) target;

        if (user.getNameofuser() == null) { // limit should be greater than 0
            errors.rejectValue("nameofuser", "nameofuser.invalid","Please provide 'name of user' parameter; a valid nameofuser is required");
        }

        if (user.getNameofuser().trim().length() < 1) { // limit should be greater than 0
            errors.rejectValue("nameofuser", "nameofuser.invalid","Please provide 'name of user' parameter; a valid nameofuser is required");
        }

    }
}
