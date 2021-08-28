package mysql.labs;

public class Passenger {
    private int passenger_id;
    private String first_name;
    private String last_name;
    private String email;
    private String meal_preference;

    public Passenger() {
    }

    public Passenger(int passenger_id, String first_name, String last_name, String email, String meal_preference) {
        this.passenger_id = passenger_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.meal_preference = meal_preference;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMeal_preference() {
        return meal_preference;
    }

    public void setMeal_preference(String meal_preference) {
        this.meal_preference = meal_preference;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger_id=" + passenger_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", meal_preference='" + meal_preference + '\'' +
                '}';
    }
}
