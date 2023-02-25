package model;

import java.util.UUID;

public class BankAccount
{
   private String accountId;
   private double balance;
   private String currency;
   private AccountStatus status;

   public BankAccount(){
       this.status=AccountStatus.CREATED;
   }

   public BankAccount(String accountId,String currency,double balance){
       this();
       this.accountId=accountId;
       this.balance=balance;
       this.currency=currency;
   }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public AccountStatus getStatus()
    {
        return status;
    }

    public void setStatus(AccountStatus status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }
}
