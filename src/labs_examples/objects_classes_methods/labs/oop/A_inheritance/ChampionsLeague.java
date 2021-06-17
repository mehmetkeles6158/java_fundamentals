package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class ChampionsLeague {
    protected int numberOfPlayers;
    protected boolean teamLogo;
    protected String stadiumName;

    public ChampionsLeague() {
    }

    public ChampionsLeague(int numberOfPlayers, boolean teamLogo, String stadiumOfName) {
        this.numberOfPlayers = numberOfPlayers;
        this.teamLogo = teamLogo;
        this.stadiumName = stadiumOfName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public boolean isTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(boolean teamLogo) {
        this.teamLogo = teamLogo;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }
}