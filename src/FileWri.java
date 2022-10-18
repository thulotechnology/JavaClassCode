import java.io.FileWriter;
import java.time.LocalDate;

public class FileWri {
    public static void main(String[] args) {
        String fileName = LocalDate.now().toString();
        try{
                FileWriter fw = new FileWriter(fileName);
                fw.write("Hello I am Asmita");
            System.out.println(fileName+ " is created.");
                fw.close();


        }catch (Exception ex){
            System.out.println("Error");
        }

    }
}
