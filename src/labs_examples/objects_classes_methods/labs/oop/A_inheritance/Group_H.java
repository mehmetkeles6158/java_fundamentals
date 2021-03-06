package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Group_H extends ChampionsLeague {
    private int numbersOfTeams;


    public Group_H(int numbersOfPlayers, boolean teamLogo, String stadiumOfName, int numbersOfTeams) {
        super(numbersOfPlayers, teamLogo, stadiumOfName);
        this.numbersOfTeams = numbersOfTeams;

    }

    @Override
    public void teamChemistry(int level) {
        System.out.println("Group teams' chemistry are strong! And their average level is " + level + ".");
    }

    public Group_H(int numbersOfTeams) {
    }

    public int getNumbersOfTeams() {
        return numbersOfTeams;
    }

    public void setNumbersOfTeams(int numbersOfTeams) {
        this.numbersOfTeams = numbersOfTeams;
    }

}
