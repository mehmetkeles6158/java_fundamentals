package labs_examples.objects_classes_methods.labs.objects;

public class gameExercise_4 {
    String gameTactic;
    int minOfDefense;
    boolean hasGameplan;

    public gameExercise_4(String gameTactic, int minOfDefense, boolean hasGameplan) {
        this.gameTactic = gameTactic;
        this.minOfDefense = minOfDefense;
        this.hasGameplan = hasGameplan;
    }

    public gameExercise_4() {
        this.gameTactic ="balance";
        this.minOfDefense = 0;
        this.hasGameplan = false;
    }

}
