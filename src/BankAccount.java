/**
 * Created by wwadge on 01/01/15.
 *
 * Abstract class is an INCOMPLETE class
 */
public abstract class BankAccount {

    private String customerName;
    private String customerSurname;
    private int balance;


    public abstract void doSomething();

    // constructor = same name as class & no return type
    // because type will always be the same as the class
    // it's defined it
    public BankAccount(String customerName){ // constructor
        this.customerName = customerName;
    }

    // overloaded constructor
    public BankAccount(String customerName, String customerSurname){
        this.customerName = customerName;
        this.customerSurname = customerSurname;
    }

    public static void foo(){
        // static = only 1 copy ala highlander
    }
}
