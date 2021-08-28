package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
 */

import mysql.examples.Course;

import java.sql.*;
import java.util.ArrayList;

public class MySQLAccess {

//    public static void main(String[] args) {
//        /*
//        Just as a casual example - each of these operations should be in it's own method. Feel free to
//        create all required classes/methods to accomplish this.
//
//        createFlight(...);
//        queryFlight(...);
//        updateFlight(...);
//        deleteFlight(...);
//
//        createPassenger(...);
//        queryPassenger(...);
//        updatePassenger(...);
//        deletePassenger(...);
//
//        ...
//
//
//         */
//    }

    /**
     * Created by ryandesmond - https://codingnomads.co
     */

        private Connection connection = null;
        private Statement statement = null;
        private PreparedStatement preparedStatement = null;
        private ResultSet resultSet = null;

        public static void main(String[] args) {
            mysql.labs.MySQLAccess example04 = new mysql.labs.MySQLAccess();


            try {
                example04.readDataBase("Ubeyde",207);
            } catch (Exception e){
                System.out.println("error in readDateBase()" + e.getMessage());
                System.out.println(e.getStackTrace());
            }
        }

        public void readDataBase(String person_name, int ID)
                throws Exception {
            try {
                // This will load the MySQL driver, each DB has its own driver
                Class.forName("com.mysql.jdbc.Driver");
                // Setup the connection with the DB
                connection = DriverManager.getConnection("jdbc:mysql://localhost/flightDB?" +
                        "user=makif&password=Mysql.1903&useSSL=false");


                // Statements allow to issue SQL queries to the database
                statement = connection.createStatement();

                // Result set get the result of the SQL query
                resultSet = statement.executeQuery("select * from flightDB.passenger;");

                //writeResultSet(resultSet);
                ArrayList<Passenger> passenger = mapResultSetToObjects(resultSet);

                for (Passenger p : passenger){
                    System.out.println(p.toString());
                }


                // PreparedStatements can use variables and are more efficient
                preparedStatement = connection
                        .prepareStatement("insert into  flightDB.passenger (passenger_id,first_name ) " +
                                "values (?, ?)");
                // Parameters start with 1
                preparedStatement.setString(2, person_name);
                // preparedStatement.setString(2, credits);
                preparedStatement.setInt(1, ID);
                //preparedStatement.setString(4, department);
                preparedStatement.executeUpdate();


                preparedStatement = connection
                        .prepareStatement("SELECT * from flightDB.passenger");
                resultSet = preparedStatement.executeQuery();

                writeResultSet(resultSet);



                //Remove again the insert comment
                preparedStatement = connection
                        .prepareStatement("delete from flightDB.passenger where first_name = ? ; ");
                preparedStatement.setString(2, "Ubeyde");
                preparedStatement.executeUpdate();

                resultSet = statement.executeQuery("select * from flightDB.passenger");

//                writeMetaData(resultSet);

            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                close();
            }

        }

        private void writeMetaData(ResultSet resultSet) throws SQLException {
            //         Now get some metadata from the database
            // Result set get the result of the SQL query

            System.out.println("The columns in the table are: ");

            System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

            for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
                System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
            }
        }

        private void writeResultSet(ResultSet resultSet) throws SQLException {
            // ResultSet is initially before the first data set
            while (resultSet.next()) {
                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1
                // e.g. resultSet.getSTring(2);
                String passenger = resultSet.getString("first_name");
                //String description = resultSet.getString("description");
                int ID = resultSet.getInt("passenger_id");
                //String department = resultSet.getString("department");
                System.out.println("Passenger: " + passenger);
                // System.out.println("Description: " + description);
                System.out.println("Passenger_id: " + ID);
                // System.out.println("Department: " + department);
                System.out.println("---------------------------------");
                System.out.println("---------------------------------");

            }
        }

        private ArrayList<Passenger> mapResultSetToObjects(ResultSet resultSet) throws SQLException {

            ArrayList<Passenger> retList = new ArrayList();

            // ResultSet is initially before the first data set
            while (resultSet.next()) {
                Passenger p= new Passenger();
                p.setPassenger_id(resultSet.getInt("passenger_id"));
                p.setFirst_name(resultSet.getString("first_name"));
                p.setLast_name(resultSet.getString("Last_name"));
                p.setEmail(resultSet.getString("email"));
                p.setMeal_preference(resultSet.getString("meal_preference"));

                retList.add(p);
            }

            return retList;
        }





        // You need to close the resultSet
        private void close() {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {

            }
        }

    }



