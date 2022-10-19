package PastWork;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f = new File("hello.txt");
        if(f.delete()){
            System.out.println("File is deleted");
        }else{
            System.out.println("Error while deleting file.");
        }
    }
}
