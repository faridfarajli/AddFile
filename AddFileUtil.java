package HH.File;

import java.io.*;

public class AddFileUtil {


    private static void writeIntofile(String fileName, String text, boolean append) throws IOException {
        try (
                FileWriter fw = new FileWriter(fileName, append);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write(text);
        }
    }

    public static void writeIntofile1(String fileName, String text) throws IOException {
        writeIntofile(fileName, text, false);
    }

    public static void appendIntofile(String fileName, String text) throws IOException {
        writeIntofile(fileName, text, true);
    }
    public static String read(String fileName) throws Exception {
        try (InputStream in = new FileInputStream(fileName);
             InputStreamReader inr = new InputStreamReader(in);
             BufferedReader bufre = new BufferedReader(inr);) {
            String line = null;
            String result = "";

            while ((line = bufre.readLine()) != null) {
                result += line + "\n";

            }
            return result;
        }
    }
}
