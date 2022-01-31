package com.example.challenge.models;

public enum CardType {
  
    Visa(10.0),
    MasterCard(5.0),
    Discover(1.0);
  
  protected Double interest;
  private CardType(double interest){
    this.interest = interest;
  }
}
