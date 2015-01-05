import java.time.LocalDate;

/**
 * Created by wwadge on 01/01/15.
 */
public class FixedAccount extends BankAccount {

    private LocalDate maturityDate;


    public FixedAccount(String customerName) {
        super(customerName);
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

}
