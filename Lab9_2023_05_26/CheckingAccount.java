/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

/**
 *
 * @author USER
 */
public class CheckingAccount extends BankAccount
{
   
     @Override
    int calculateinterest(){
    return getbalance()*2/100; 
    }
}


