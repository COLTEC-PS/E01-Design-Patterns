package strategy;

public class LengthStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        return password.length() >= 8;
    }

}