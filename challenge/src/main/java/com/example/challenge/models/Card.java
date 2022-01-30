package com.example.challenge.models;

public class Card extends CardType{
  protected double balance;

  public Card(String name, double balance, double interestRate){
    super(name, interestRate);
    setBalance(balance);
  }  

  public double calculateInterest(){
    return balance * (interestRate / 100);
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
