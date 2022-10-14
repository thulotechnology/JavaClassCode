import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
      String fileData = readFile();
      createFile(fileData);

    }
    public static void createFile(String text){
        try {
            FileWriter myWriter = new FileWriter("fil2.txt");
            myWriter.write(text);
            myWriter.close();
            System.out.println("Write to file successful.");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }

    public static String readFile(){
        String fileText ="";
        try {
            File myObj = new File("file.txt");
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String mydata = reader.nextLine();
               fileText+=mydata;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

        return  fileText;
    }
}
