package labs_examples.objects_classes_methods.labs.objects;

public class controllerExercise_4 {
    public static void main(String[] args) {

        gameExercise_4 manchesterCity = new gameExercise_4();
        gameExercise_4 realMadrid = new gameExercise_4();
        gameExercise_4 besiktas = new gameExercise_4();

        manchesterCity.gameTactic = "offensive";
        manchesterCity.hasGameplan = true;
        manchesterCity.minOfDefense = 20;

        realMadrid.gameTactic = "Fast buildup";
        realMadrid.hasGameplan = true;
        realMadrid.minOfDefense = 40;

        besiktas.gameTactic = "ball possession";
        besiktas.hasGameplan = true;
        besiktas.minOfDefense = 65;

        System.out.println("Besiktas is playing with tactic of " + besiktas.gameTactic + " for most of the games." + "They are statistically playing " + besiktas.minOfDefense + " minutes in defensive-mode");

    }
}
