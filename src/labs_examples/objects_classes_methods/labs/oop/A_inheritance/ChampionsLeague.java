package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class ChampionsLeague {
    protected int numberOfPlayers;
    protected boolean teamLogo;
    protected String stadiumOfName;

    public ChampionsLeague() {
    }

    public ChampionsLeague(int numberOfPlayers, boolean teamLogo, String stadiumOfName) {
        this.numberOfPlayers = numberOfPlayers;
        this.teamLogo = teamLogo;
        this.stadiumOfName = stadiumOfName;
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

    public String getStadiumOfName() {
        return stadiumOfName;
    }

    public void setStadiumOfName(String stadiumOfName) {
        this.stadiumOfName = stadiumOfName;
    }
}