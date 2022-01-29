package com.example.challenge.models;

public class Person {
  private Wallet[] wallets;

  //constructor
  Person(){
    
  }

  public Wallet[] getWallets() {
    return wallets;
  }

  public void setWallets(Wallet[] wallets) {
    this.wallets = wallets;
  }

  public void addWallet(Wallet wallet){
    wallets[wallets.length] = wallet;
  }

}
