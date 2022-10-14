import java.io.File;
import java.io.FileWriter;
public class FileCreate {
    public static void main(String[] args) {
    try{
        File f = new File("hello.txt");
        if(f.createNewFile()){
            System.out.println("File is is successfully created.");
            FileWriter myWriter = new FileWriter("hello.txt");
            myWriter.write("We are at automation class.");
            myWriter.close();
            System.out.println("Write to file successful.");
        }else{
            System.out.println("Error while creating file.");
        }
    }catch (Exception ex){

    }
    }
}
// WAP IN JAVA TO CREATE FILE <Yourname>.csv
// WAP IN JAVA TO WRITE YOUR ADDRESS TO FILE.