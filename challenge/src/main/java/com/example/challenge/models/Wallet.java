package com.example.challenge.models;

import java.util.ArrayList;

public class Wallet {
  private ArrayList<Card> cards;

  public Wallet(){
    cards = new ArrayList<Card>();
  }

  public ArrayList<Card> getCards() {
    return cards;
  }

  public void setCards(ArrayList<Card> cards) {
    this.cards = cards;
  }

  public void addCard(Card card){
    cards.add(card);
  }

  public double calculateInterest(){
    double total = 0.0;
    for(int i = 0; i < cards.size(); i++){
      total += cards.get(i).calculateInterest();
    }
    return total;
  }

}
