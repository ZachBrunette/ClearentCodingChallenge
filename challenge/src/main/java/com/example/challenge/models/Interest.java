package com.example.challenge.models;

//open/closed principle: open for extension, extended by person, wallet, card
public interface Interest {
  public double calculateInterest();
}
