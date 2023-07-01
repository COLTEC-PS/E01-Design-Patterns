package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public PasswordValidator(){
        strategy = new LengthStrategy();
    }

    public void setStrategy(PasswordStrategy strategy){
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return strategy.validate(password);
    }

}
