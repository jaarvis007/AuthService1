package org.example.Util;
import java.util.regex.Pattern;

import org.example.model.UserInfoDto;

public class ValidateUtil {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"
    );

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}|:;\"'<>,.?/]).{8,}$"
    );

    public static void validateUserAttribute(UserInfoDto userInfoDto){

            if (userInfoDto == null || userInfoDto.getEmail() == null || userInfoDto.getPassword() == null) {
                throw new IllegalArgumentException("User data is incomplete.");
            }

            if (!EMAIL_PATTERN.matcher(userInfoDto.getEmail()).matches()) {
                throw new IllegalArgumentException("Invalid email format.");
            }

            if (!PASSWORD_PATTERN.matcher(userInfoDto.getPassword()).matches()) {
                throw new IllegalArgumentException("Password must be at least 8 characters long and contain at least one lowercase letter, one uppercase letter, one digit, and one special character.");
            }

    }
}
