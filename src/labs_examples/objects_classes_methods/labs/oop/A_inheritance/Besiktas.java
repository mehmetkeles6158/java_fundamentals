package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Besiktas extends Group_H {

    private int yearOfFoundation;

    public Besiktas(int numbersOfTeams, int yearOfFoundation) {
        super(numbersOfTeams);
        this.yearOfFoundation = yearOfFoundation;
    }

    public Besiktas(int numbersOfPlayers, boolean teamLogo, String stadiumOfName, int yearOfFoundation) {
        super(numbersOfPlayers,teamLogo,stadiumOfName,yearOfFoundation);
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }
}

