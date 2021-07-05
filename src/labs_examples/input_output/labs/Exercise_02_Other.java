package labs_examples.input_output.labs;

import java.io.*;

public class Exercise_02_Other {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_2.txt"));
            out = new BufferedOutputStream(new FileOutputStream("/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_2_encrypted.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int ch = 0;
        while (true) {
            try {
                if ((ch = in.read()) == -1)
                    break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (ch == 'a')
                ch = '@';

            out.write(ch);
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
