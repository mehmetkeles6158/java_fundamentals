package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 * package, create a new application that will parse a custom CSV file that you created and map each line of the
 * csv to a custom POJO that you create.
 * <p>
 * Then add that object to an arraylist. After you have mapped each row of the csv to objects
 * and added each object to an arraylist, print out each object using the objects custom toString() method.
 * <p>
 * Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 */

public class Exercise_04 {

    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList();

        String filePath = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/teams.csv";


        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                teams.add(mapValuesToTeamObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Team team : teams) {
            System.out.println(team.toString());
        }

    }

    private static Team mapValuesToTeamObject(String[] values) {

        Team team = new Team();

        team.setFoundationDate(Integer.parseInt(values[0]));
        team.setTeamName(values[1]);
        team.setFieldName(values[2]);
        team.setTeamSize(Integer.parseInt(values[3]));

        return team;

    }

}
