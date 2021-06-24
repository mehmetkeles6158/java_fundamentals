package labs_examples.packages.labs.package_2;

import labs_examples.packages.labs.package_1.SoccerPlayer;

public class BasketPlayerDemo {
    public static void main(String[] args) {

        BasketballPlayer basketballPlayer = new BasketballPlayer("Steve Nash");
        String name = basketballPlayer.getName();
        System.out.println(name);

        SoccerPlayer soccerPlayer = new SoccerPlayer("Guti Hernandez", 32, "Spanish");
        soccerPlayer.show();

        BasketPlayerDemo obj = new BasketPlayerDemo();

        // System.out.println(obj.playerPracticeTime); ( not able to access this method in different package)


    }
}
