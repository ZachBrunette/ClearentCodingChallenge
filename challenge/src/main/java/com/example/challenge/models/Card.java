package com.example.challenge.models;

public class Card extends CardType{
  public double balance;

  Card(double balance, double interestRate){
    super(interestRate);
    setBalance(balance);
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
