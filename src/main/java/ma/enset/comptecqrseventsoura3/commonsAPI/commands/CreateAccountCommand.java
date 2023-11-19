package ma.enset.comptecqrseventsoura3.commonsAPI.commands;

public class CreateAccountCommand extends BAseCommand<String>{
    private double initialBalance;
    private String currency;
    public CreateAccountCommand(String id, String currency, double initialBalance) {
        super(id);
        this.currency=currency;
        this.initialBalance=initialBalance;
    }
}
