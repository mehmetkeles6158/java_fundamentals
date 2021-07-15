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
            switch (card.cardValue) {
                case 'A':
                    currentScore += 1;
                    break;
                case '2':
                    currentScore += 2;
                    break;
                case '3':
                    currentScore += 3;
                    break;
                case '4':
                    currentScore += 4;
                    break;
                case '5':
                    currentScore += 5;
                    break;
                case '6':
                    currentScore += 6;
                    break;
                case '7':
                    currentScore += 7;
                    break;
                case '8':
                    currentScore += 8;
                    break;
                case '9':
                    currentScore += 9;
                    break;
                case 'T':
                    currentScore += 10;
                    break;
                case 'J':
                    currentScore += 10;
                    break;
                case 'Q':
                    currentScore += 10;
                    break;
                case 'K':
                    currentScore += 10;
                    break;

            }

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

    public void printHand(boolean Player) {

            StringBuilder sd = new StringBuilder();
            if (Player) {

                for (Card card : cards) {
                    sd.append(card.toString()).append(" ");
                }
                System.out.println(sd.toString() + handValue);

            } else {
                sd.append(cards.get(0).toString()).append(" ");
                System.out.println(sd.toString());

            }

        }

    }
