package Service;

import java.io.*;

    /**
    * File: DataManipulation.java <br>
    * Purpose: This class has the methods who makes the data manipulation of the system (read/write files). <br>
    * @author Hialo
    * @version 1.0
    */

public class DataManipulation {
    
    /**
     * Function to write over a text file.
     * @param dir The diretory of the file.
     * @param arq The file itself.
     * @param content The content who will be wrote on the file.
     * @param overwrite Boolean to possible overwrite of the file.
     * @throws IOException Exception for not  being able to open the file.
     */

    public static void write(File dir, File arq, String content, boolean overwrite) throws IOException {
        FileWriter fileWriter = new FileWriter(arq, overwrite);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(content);

        printWriter.flush();
        printWriter.close();
    }

    /** Function to read a text file.
     * 
     * @param dir The directory of the file.
     * @param arq The file itself.
     */
    
    public static void read(File dir, File arq) {
        try {
            FileReader fileReader = new FileReader(arq);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
