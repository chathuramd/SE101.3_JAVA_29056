
package com.mycompany.lab9;



abstract class BankAccount 
{
    private int accountNumber,balance;
    
public void setdata(int accno,int bal)
{
    accountNumber= accno;
    balance= bal;
}
public int getaccountNumber()
  {
        return accountNumber;
  }
  public int getbalance()
  {
        return balance;
  }
 abstract int calculateinterest();     
   
}
