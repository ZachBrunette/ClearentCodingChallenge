package com.example.challenge.models;

import java.util.ArrayList;

public class Person implements Interest {
  private ArrayList<Wallet> wallets;

  //constructor
  public Person(){
    //dependency injection
    wallets = new ArrayList<Wallet>();
  }

  public ArrayList<Wallet> getWallets() {
    return wallets;
  }

  public void setWallets(ArrayList<Wallet> wallets) {
    this.wallets = wallets;
  }

  public void addWallet(Wallet wallet){
    wallets.add(wallet);
  }

  public double calculateInterest(){
    double total = 0.0;
    for(int i = 0; i < wallets.size(); i++){
      total += wallets.get(i).calculateInterest();
    }
    return total;
  }

}
