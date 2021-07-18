package labs_examples.enumerations.labs;

public class MyLabExample01 {
    public enum Restaurant{
        OLIVEGARDEN(5), PANERA(4), CHIPOTLE(3);

        Restaurant(int level){
            this.level = level;
        }

        private final int level;

        public int getLevel(){
            return level;
        }
    }
}

class FirstExample{
    public static void main(String[] args) {
        for(MyLabExample01.Restaurant r : MyLabExample01.Restaurant.values()){
            System.out.println("Restaurant: " + r + " ;");

            if(r.getLevel()>=5){
                System.out.println("The Quality of Foods, ");
            } else {
                System.out.println("No Quality of Foods");
            }
            switch (r) {
                case OLIVEGARDEN:
                    System.out.println("Great Italian Restaurant!");
                    continue;
                case PANERA:
                    System.out.println("Their Breakfast is awesome!");
                    continue;
                default:
                    System.out.println("their food is OK");
            }
        }
    }
}
