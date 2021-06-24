package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {

        Deck deck = new Deck();
        for(Card card : deck.cards){
            System.out.println(card);
        }

        System.out.println(Deck.numOfCards);

        Player player_1 = new Player("Mehmet",100);

        deck.deal(player_1);
        deck.deal(player_1);
        deck.deal(player_1);
        System.out.println(player_1.hand.cards);

    }
}
