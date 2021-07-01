package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {


    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    char[] ranks = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    int suit;
    int cardValue;

    public Card(int suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suits[suit] +
                ", cardValue=" + ranks[cardValue - 1] +
                '}';
    }

    public int getValue() {
        return this.cardValue;
    }
}
