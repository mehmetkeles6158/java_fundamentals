package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, ead back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */
public class Exercise_02 {
    public static void main(String[] args) throws IOException {


        String fileReadPath = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/KtoD.txt";
        String fileWritePath = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/KtoD.txt_encrypted";

        // declare BufferedReader and PrintWriter
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {

            inputStream = new BufferedReader(new FileReader(fileReadPath));
            outputStream = new PrintWriter(new FileWriter(fileWritePath));

            String l;

            while ((l = inputStream.readLine()) != null) {


                outputStream.println(l.replace("a", "@"));


            }

        } catch (IOException exc) {
            System.out.println("An error occurred: " + exc.getMessage());

        } finally {
            // close connections
            try {
                inputStream.close();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
            outputStream.close();

        }

    }


}



