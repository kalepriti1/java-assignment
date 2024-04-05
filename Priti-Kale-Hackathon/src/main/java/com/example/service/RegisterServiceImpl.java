package com.example.service;

import com.example.entity.Register;
import com.example.exception.*;
import com.example.repository.RegisterRepository;
import com.example.utility.Appconst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public String registerUser(Register register) {
        if (validateUserDetails(register)) {
            if (registerRepository.existsByEmailId(register.getEmailId())) {
                throw new AccountAlreadyExistsException(Appconst.ACCOUNT_ALREADYEXISTS_EXCEPTIONMESSAGE);
            } else {
                registerRepository.save(register);
                return Appconst.ACCOUNT_REGISTERED_SCCUESSFULLY;
            }
        }
        return null;
    }

    public boolean validateUserDetails(Register register) {
        return validateEmail(register.getEmailId()) &&
                validateName(register.getName()) &&
                validatePhoneNumber(register.getMobileNo()) &&
                validatePassword(register.getPassword());
    }

    private boolean validateEmail(String emailId) {
        boolean emailValid = emailId.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$");
        if (!emailValid) {
            throw new EmailNotValidException(Appconst.EMAIL_NOTVALID_MESSAGE);
        }
        return true;
    }

    private boolean validateName(String name) {
        if (name.isBlank()) {
            throw new NameNotNullException(Appconst.NAME_NOTNULL_MESSAGE);
        }
        if (!name.matches("[A-Z][a-z]*")) {
            throw new NameNotValidException(Appconst.NAMENOT_VALID_MESSAGE);
        }
        return true;
    }

    private boolean validatePhoneNumber(String mobileNo) {
        if (mobileNo == null) {
            throw new PhoneNumberNotNull(Appconst.PHONENUMBER_NOTNULL_MESSAGE);
        }
        if (!(mobileNo.matches("[0-9]+") && mobileNo.length() == 10)) {
            throw new PhoneNumberNotValidException(Appconst.PHONENUMBER_NOTNULL_MESSAGE);
        }
        return true;
    }

    public boolean validatePassword(String password) {
        // Define the regular expression pattern for password validation
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher with the given password
        Matcher matcher = pattern.matcher(password);

        // Check if the password matches the pattern
        boolean isValid = matcher.matches();

        if (isValid){
            return true;
        }else{
            throw new PasswordNotValidException(Appconst.PASSWORD_NOTVALID_MESSAGE);
        }
    }



    @Override
    public Register findByEmailId(String emailId) {
        return registerRepository.findByEmailId(emailId);
    }
}
