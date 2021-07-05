package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {


    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    char[] ranks = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    char suit;
    char cardValue;

    public Card(int suit, int cardValue) {
        this.suit = suits[suit];
        this.cardValue = ranks[cardValue];
    }

    @Override
    public String toString() {
        String s = cardValue + "" + suit;
        return s;
    }

    public int getValue() {
        return this.cardValue;
    }
}
