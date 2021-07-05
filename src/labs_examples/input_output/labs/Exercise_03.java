package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams
 * 2) Demonstrate the usage of at least two additional Character Streams
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */
public class Exercise_03 {

    public static void main(String[] args) throws IOException {


        //1) Demonstrate the usage of at least two additional Byte Streams


        byte userName[] = new byte[10];

        System.out.println("Create your username with max 10 characters!");

        System.in.read(userName);

        System.out.print("You entered: ");
        for (int i = 0; i < userName.length; i++)
            System.out.print((char) userName[i]);


        byte passWord[] = new byte[12];

        System.out.println("Create your password with between 8-12 characters!");

        System.in.read(passWord);
        System.out.print("You entered: ");
        for (int i = 0; i < passWord.length; i++)
            System.out.print((char) passWord[i]);


        //2nd example for bytestream(Compare Files)

        int i = 0;
        int j = 0;

        String filePath1 = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_2.txt";
        String filePath2 = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_change.txt";


        try (FileInputStream f1 = new FileInputStream(filePath1);
             FileInputStream f2 = new FileInputStream(filePath2)) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j)
                    break;
            } while (i != -1 && j != -1);

            if (i != j)
                System.out.println("Files are different!");
            else
                System.out.println("Files are the same.");
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }


        //2) Demonstrate the usage of at least two additional Character Streams
        //First Example


        FileReader input = null;
        FileWriter output = null;
        try {
            input = new FileReader("/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt");
            output = new FileWriter("/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_copied.txt");
            int ch;
            while ((ch = input.read()) != -1) {
                output.write(ch);

            }
        } catch (IOException exc) {
            System.out.println("An error found: " + exc.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }

        //Second Example of Character!

        String data = "This is the text says that Besiktas is Champion.";
        // Create a character array
        char[] array = new char[200];
        try {
            // Create a StringReader
            StringReader inputData = new StringReader(data);
            //Use the read method
            inputData.read(array);
            System.out.println("The data read from the string:");
            System.out.println(array);
            inputData.close();
        } catch (Exception e) {
            e.getStackTrace();
        }


        // 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams.


        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            inputStream = new FileInputStream("labs_examples/input_output/files/byte_data");
            bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[4];
            int bRead = 0;

            while ((bRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // 2nd buffer example

        char c;

        BufferedReader bReader = new
                BufferedReader(new InputStreamReader(System.in));

        System.out.println("Guess a number between 0-10!");

        // read characters
        do {
            c = (char) bReader.read();
            System.out.print(c);
        } while (c != '2');

        System.out.println("That's correct number!");

        //4) Demonstrate the use of the DataInputStream and DataOutputStream


        int a;

        String fileReadPath = "/src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_copied_3.txt";

        try (FileInputStream fInput = new FileInputStream(fileReadPath);
             FileOutputStream fOutput = new FileOutputStream(fileWritePath)) {

            do {
                a = fInput.read();
                if (a != -1)
                    fOutput.write(i);
            } while (a != -1);


        } catch (IOException exc) {
            System.out.println("I/O Error Found: " + exc);
        }
    }


}











