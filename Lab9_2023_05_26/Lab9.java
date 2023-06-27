
package com.mycompany.lab9;


public class Lab9 {

    public static void main(String[] args) {
        
       
        CheckingAccount obj1 = new CheckingAccount();
        obj1.setdata(0016, 1000000);
        System.out.println("interest is"+obj1.calculateinterest());
        SavingAccount obj2 = new SavingAccount();
        obj2.setdata(0016, 20000000);
    }
}

        
        
        
