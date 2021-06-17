package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class ChampionsLeagueController {
    public static void main(String[] args) {
        Group_H group_h = new Group_H(92, true, "vodafone park, webley, sansiro and campnou.", 4);
        Besiktas besiktas = new Besiktas(23,true,"Vodafone park",1903);

        System.out.println(group_h.getNumbersOfTeams());
        System.out.println(group_h.stadiumName);
        System.out.println(besiktas.getYearOfFoundation());
    }
}
