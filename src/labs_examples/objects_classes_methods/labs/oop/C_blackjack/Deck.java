package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

//1) In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
//should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
//(spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings

//Card[] cards = new Card[52];
//ArrayList<Integer> used = new ArrayList<>();
//Deck deck = new Deck(cards, used);
//deck.createFullDeck();




public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck() {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public void createFullDeck() {
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards[index] = new Card(suit, value);
                index++;

            }
        }
    }

}
