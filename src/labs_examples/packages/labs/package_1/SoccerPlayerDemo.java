package labs_examples.packages.labs.package_1;

public class SoccerPlayerDemo {
    public static void main(String[] args) {
        SoccerPlayer player[] = new SoccerPlayer[2];
        player[0] = new SoccerPlayer("Rodri", 23, "Spain");
        player[1] = new SoccerPlayer("Sterling", 26, "England");

        for (int i = 0; i < player.length; i++) player[i].show();

        SoccerPlayer obj_1 = new SoccerPlayer("Mehmet", 32, "Turkish");

        System.out.println(obj_1.playerPracticeTime(40, 4));

    }
}
