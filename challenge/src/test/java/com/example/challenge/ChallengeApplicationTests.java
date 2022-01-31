package com.example.challenge;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.challenge.models.*;

@SpringBootTest
class ChallengeApplicationTests {

	@Test
	void Test1() {
    Person person = new Person();
    Wallet wallet = new Wallet();
    person.addWallet(wallet);
    Card card1 = new Card(CardType.Visa, 100.00);
    Card card2 = new Card(CardType.MasterCard, 100.00);
    Card card3 = new Card(CardType.Discover, 100.00);
    wallet.addCard(card1);
    wallet.addCard(card2);
    wallet.addCard(card3);
    assertEquals(10.00, card1.calculateInterest());
    assertEquals(5.00, card2.calculateInterest());
    assertEquals(1.00, card3.calculateInterest());
    assertEquals(16.00, wallet.calculateInterest());
    assertEquals(16.00, person.calculateInterest());
	}

	@Test
	void Test2() {
    Person person = new Person();
    Wallet wallet1 = new Wallet();
    person.addWallet(wallet1);
    Card card1 = new Card(CardType.Visa, 100.00);
    Card card2 = new Card(CardType.Discover, 100.00);
    wallet1.addCard(card1);
    wallet1.addCard(card2);
    Wallet wallet2 = new Wallet();    
    person.addWallet(wallet2);
    Card card3 = new Card(CardType.MasterCard, 100.00);
    wallet2.addCard(card3);
    assertEquals(10.00, card1.calculateInterest());
    assertEquals(1.00, card2.calculateInterest());
    assertEquals(11.00, wallet1.calculateInterest());
    assertEquals(5.00, card3.calculateInterest());
    assertEquals(5.00, wallet2.calculateInterest());
    assertEquals(16.00, person.calculateInterest());
	}

	@Test
	void Test3() {
    Person person1 = new Person();
    Wallet wallet1 = new Wallet();
    person1.addWallet(wallet1);
    Card card1 = new Card(CardType.MasterCard, 100.00);
    Card card2 = new Card(CardType.Visa, 100.00);
    wallet1.addCard(card1);
    wallet1.addCard(card2);
    Person person2 = new Person();
    Wallet wallet2 = new Wallet();    
    person2.addWallet(wallet2);
    Card card3 = new Card(CardType.Visa, 100.00);
    Card card4 = new Card(CardType.MasterCard, 100.00);
    wallet2.addCard(card3);
    wallet2.addCard(card4);
    assertEquals(5.00, card1.calculateInterest());
    assertEquals(10.00, card2.calculateInterest());
    assertEquals(15.00, wallet1.calculateInterest());
    assertEquals(15.00, person1.calculateInterest());
    assertEquals(10.00, card3.calculateInterest());
    assertEquals(5.00, card4.calculateInterest());
    assertEquals(15.00, wallet2.calculateInterest());
    assertEquals(15.00, person2.calculateInterest());
	}

}
