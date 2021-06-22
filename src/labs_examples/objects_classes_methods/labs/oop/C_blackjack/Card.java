package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {


    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(int suit, int value) {
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + Arrays.toString(suit) +
                ", cardValue=" + cardValue +
                '}';
    }

    public int getValue() {
        return this.cardValue;
    }
}
