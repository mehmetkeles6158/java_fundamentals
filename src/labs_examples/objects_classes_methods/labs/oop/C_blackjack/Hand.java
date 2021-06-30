package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    //3) In the Hand class create a method that will return the score of the hand. The hand is an arraylist of Card objects.
    //An ace is worth one, a 2 is worth two, a 3 is worth three, ... a jack is worth 10, a queen is worth 10,
    //a king is worth 10.


    ArrayList<Card> cards = new ArrayList<>();
    int handValue;

    public int score() {
        int currentScore = 0;

        for (Card card : this.cards) {
            if (card.cardValue > 10) {
                currentScore += 10;
            } else
                currentScore += card.cardValue;

        }
        return currentScore;

    }

    //4) In the Hand class, create a method that will return true if the hand value is greater than 21 and false if the hand
    //value is less than 21
    public boolean checking21() {
        if (handValue > 21) {
            return true;
        } else
            return false;
    }

    public void printHand(){
        for(Card card: cards){
            System.out.println(card.toString());
        }

    }
}
