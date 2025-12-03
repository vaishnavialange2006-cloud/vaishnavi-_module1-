// Module 4 - Q7
// In a Banking System, a customer’s Account Number should never change. 
// The bank also has a standard method bankPolicy() that must not be modified by any type of account. 
// The class CentralBankRules contains rules that no other class should extend. 

class BankAccount {
    private final String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public final void bankPolicy() {
        System.out.println("Common bank policy for all accounts.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

final class CentralBankRules {
    void showRules() {
        System.out.println("Central bank rules cannot be changed.");
    }
}

public class M4_Q7 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC12345");
        System.out.println("Account Number: " + acc.getAccountNumber());
        acc.bankPolicy();
        CentralBankRules rules = new CentralBankRules();
        rules.showRules();
    }
}
