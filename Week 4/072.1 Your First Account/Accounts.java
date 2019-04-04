
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account bankAccount = new Account("Bank account", 100.0);
        
        bankAccount.deposit(20.0);
        
        System.out.println(bankAccount);
    }

}
