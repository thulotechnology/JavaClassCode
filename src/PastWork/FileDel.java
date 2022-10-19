package PastWork;

import java.io.File;
public class FileDel {
    public static void main(String[] args) {
        File f = new File("asmita.txt");

        if(f.delete()){
            System.out.println("Deleted successfully");
        }else{
            System.out.println("Error while delete.");
        }
    }
}
