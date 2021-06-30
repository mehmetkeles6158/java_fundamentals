package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;


public class Deck {

    //1) In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
//should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
//(spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings



//Card[] cards = new Card[52];
//ArrayList<Integer> used = new ArrayList<>();
//Deck deck = new Deck(cards, used);
//deck.createFullDeck();

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();
    static int numOfCards = 0;

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Deck() {
        createFullDeck();

    }



    public void createFullDeck() {
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards[index] = new Card(suit, value);
                index++;
                numOfCards++;

            }
        }
    }

    //2) Create a deal() method that will take in a Player object and "deal" that player a random card out of the deck. To get
//the random card, generate a random number between 1 and 52 (inclusive). Then check the ArrayList of Integers to make sure
//that random number is not in there. If it is, that means the card has already been drawn. You need to generate new random
//numbers until you find a card that has not been drawn. If/when the random number has not yet been played add the card at the index
//of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
//called usedCards in the Deck class. This usedCards arraylist tracks the cards that have already been dealt.


    public void deal(Player player){

        Random rand = new Random();
        int randomIndex = rand.nextInt(52);

        while(usedCards.contains(randomIndex)){
            randomIndex = rand.nextInt(52);
        }
        player.hand.cards.add(cards[randomIndex]);
        player.hand.handValue = player.hand.score();
        usedCards.add(randomIndex);

    }


}
