package PastWork;

import java.io.FileWriter;
public class FileWriteWork {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("myfile.txt",true);
            fw.write("\nHari");
            fw.close();
            System.out.println("File write successful.");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
