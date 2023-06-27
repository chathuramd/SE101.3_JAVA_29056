package com.mycompany.lab9;


public class SavingAccount extends BankAccount{
    @Override
    int calculateinterest(){
        
    return getbalance()*12/100;       
    }
}
