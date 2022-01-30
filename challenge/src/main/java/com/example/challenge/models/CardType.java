package com.example.challenge.models;

public abstract class CardType {
  private String name;
  protected double interestRate;

  public CardType(String name, double interestRate){
    setInterestRate(interestRate);
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
