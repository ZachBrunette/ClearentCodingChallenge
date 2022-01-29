package com.example.challenge.models;

public abstract class CardType {
  private double interestRate;

  CardType(double interestRate){
    setInterestRate(interestRate);
  }

  public double calculateInterest(double cardBalance){
    return cardBalance * (interestRate / 100);
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
