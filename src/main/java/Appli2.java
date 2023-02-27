import Business.BankAccountService;
import Business.BankAccountServiceImpl;
import model.CurrentAccount;
import model.SavingAccount;

public class Appli2
{
    public static void main(String[] args)
    {
        BankAccountService accountService=new BankAccountServiceImpl();

        accountService.addBankAccount(new CurrentAccount("AM160937","MAD",42000,5000));
        accountService.addBankAccount(new SavingAccount("TH160936","MAD",92000,4.5));
        accountService.addBankAccount(new CurrentAccount("FE160938","MAD",82000,5000));
        accountService.addBankAccount(new SavingAccount("AD160939","MAD",42400,3.5));
        accountService.addBankAccount(new CurrentAccount("XE160940","MAD",46000,5000));
        accountService.addBankAccount(new SavingAccount("AB160941","MAD",45000,2.5));

        System.out.println(accountService.getAccountbyId("MD544434"));
    }
}