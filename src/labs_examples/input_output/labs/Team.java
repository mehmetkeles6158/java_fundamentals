package labs_examples.input_output.labs;

public class Team {

    private int foundationDate;
    private String teamName;
    private String fieldName;
    private int teamSize;

    public Team() {
    }

    public Team(int foundationDate, String teamName, String fieldName, int teamSize) {
        this.foundationDate = foundationDate;
        this.teamName = teamName;
        this.fieldName = fieldName;
        this.teamSize = teamSize;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(int foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Team{" +
                "foundationDate=" + foundationDate +
                ", teamName='" + teamName + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", teamSize=" + teamSize +
                '}';
    }
}
