package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import sun.awt.util.IdentityArrayList;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {

        BlackjackController blackjackController = new BlackjackController();
        blackjackController.playBlackJack();

//        Deck deck = new Deck();
//        for(Card card : deck.cards){
//            System.out.println(card);
//        }
//
//        System.out.println(Deck.numOfCards);
//        Player player_1 = new Player("Mehmet",100);
//
//        deck.deal(player_1);
//        System.out.println(player_1.hand.cards);

//1) In the BlackJackController, create a method named playBlackJack(). This method will interact with the user by printing
//out questions and using a Scanner to get answers. First, create two Player objects. One should have the name of the user
//(that they enter through the console) and the other will be the computer player.

//2) After you have created both players, deal them each two cards from the deck. These cards should be added to the
//players "hand" objects. Print the two cards the user received and their current hand value to the console and ask them
//if they want another card. If they say "yes" to another card, deal them another card and print out all their cards and
//their hand value again. Then call the computerAi method to determine whether or not the computer wants another card.
//Print out whether the computer took another card or not. Repeat this process (asking for another card and dealing0 doing
//this until both the user and the computer say "no" to another card, or until both players hand value is over 21.


//3) When both players say "no" to another card (or when both players have "busted" (gone over 21)) print out both the users
//hand and hand value as well as the computers hand and hand value and indicate who won, or whether you both lost.

    }
    //1) In the BlackJackController, create a method named playBlackJack(). This method will interact with the user by printing
//out questions and using a Scanner to get answers. First, create two Player objects. One should have the name of the user
//(that they enter through the console) and the other will be the computer player.


    public void playBlackJack() {

        System.out.println("Welcome to BlackJack Game. Please follow directions to play the game!");
        Player computer = createPlayer(true);
        Player player = createPlayer(false);

        System.out.println("-----ComputerHand-------");
        Deck deck = new Deck();
        deck.deal(computer);
        deck.deal(computer);
        computer.hand.printHand();

        while (computer.computerAI()) {
            deck.deal(computer);
            computer.hand.printHand();
        }

        System.out.println("------------------------");

        deck.deal(player);
        deck.deal(player);
        player.hand.printHand();

        Scanner newCard = new Scanner(System.in);
        System.out.println("Do you need a new card?");
        String playerNewCard = newCard.next();
        while (playerNewCard.equals("yes") && player.hand.handValue < 21) {
            deck.deal(player);
            player.hand.printHand();
            System.out.println("Do you need a new card?");
            playerNewCard = newCard.next();
        }

        //3) When both players say "no" to another card (or when both players have "busted" (gone over 21)) print out both the users
//hand and hand value as well as the computers hand and hand value and indicate who won, or whether you both lost.

        if (player.hand.handValue > 21 && computer.hand.handValue > 21) {
            System.out.println("You busted!");
        } else if (player.hand.handValue <= 21 && player.hand.handValue > computer.hand.handValue) {
            System.out.println("You won!");
        } else if (computer.hand.handValue <= 21 && computer.hand.handValue > player.hand.handValue) {
            System.out.println("Computer won! You lost!");
        } else if (player.hand.handValue <= 21 && player.hand.handValue == computer.hand.handValue) {
            System.out.println("It is a draw!");
        }

    }

    public Player createPlayer(boolean dealer) {
        Player player;

        if (dealer) {
            player = new Player("computerPlayer");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = input.next();
            System.out.println("Please enter your pot value: ");
            int potValue = input.nextInt();
            player = new Player(name, potValue);


        }
        return player;
    }

}
