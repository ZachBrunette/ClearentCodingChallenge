package com.example.challenge.models;

public class Card implements Interest{
  private double balance;
  private CardType cardType;

  public Card(CardType cardType, double balance){
    setBalance(balance);
    setCardType(cardType);
  }  

  public double calculateInterest(){
    return balance * (cardType.interest / 100);
  }

  public CardType getCardType() {
    return cardType;
  }

  public void setCardType(CardType cardType) {
    this.cardType = cardType;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
