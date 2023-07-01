package strategy;

import java.util.regex.Pattern;

public class SpecialCharStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        return password.matches(".*[^a-zA-Z0-9].*");
    }

}
