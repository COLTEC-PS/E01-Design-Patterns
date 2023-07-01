package strategy;

public class UpperCaseStrategy extends  PasswordStrategy {

    @Override
    public boolean validate(String password) {
        int tam = password.length(), i = 0;
        char character;
        boolean contain = false;

        while(!contain && i < tam) {
            character = password.charAt(i);
            contain = Character.isUpperCase(character);
            i++;
        }

        return contain;
    }
}
