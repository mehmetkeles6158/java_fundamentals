package labs_examples.packages.labs.package_1;

public class SoccerPlayer {

    public String playerName;
    public int playerAge;
    public String playerNationality;

    public SoccerPlayer(String n, int a, String p) {
        playerName = n;
        playerAge = a;
        playerNationality = p;

    }

    public void show() {
        System.out.println(playerName);
        System.out.println(playerAge);
        System.out.println(playerNationality);
        System.out.println();
    }

    protected int playerPracticeTime(int minInDay, int days) {
        return minInDay * days;
    }


}
