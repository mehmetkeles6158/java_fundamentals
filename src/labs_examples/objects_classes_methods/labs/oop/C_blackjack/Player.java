package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    //5) In the Player class, create a method named computerAI that will return true if the computer player wants another card.
    //It will return false is the computer player does not want another card. If the computer player's hand currently has a
    //value less than 16 it will want another card. If the hand value is greater than or equal to 16 the computer will not
    //want another card.

    String name;
    Hand hand;
    int potValue; //(the amount of money they have)

    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        this.hand = new Hand();
    }

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public boolean computerAI() {
        if (hand.handValue < 16) {
            return true;} else
        return false;

    }
}


