import java.io.File;

public class FileWork2 {
    public static void main(String[] args) {
        try {
        File f = new File("myname.html");
        if(f.createNewFile()){
            System.out.println("File is created.");
        }else{
            System.out.println("Error while creating file.");
        }
        }catch (Exception ex){
            System.out.println("Error");
        }
    }
}
