package ma.enset.comptecqrseventsoura3.commonsAPI.commands;

public class CreditAccountCommand extends BAseCommand<String>{
    private double amount;
    private String currency;
    public CreditAccountCommand(String id, String currency, double amount) {
        super(id);
        this.currency=currency;
        this.amount=amount;
    }
}
