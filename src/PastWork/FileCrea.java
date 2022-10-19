package PastWork;

import java.io.File;

public class FileCrea {
    public static void main(String[] args) {
        try {
           for(int i=1; i<=100; i++){
               File f = new File("file"+i+".txt");
               if(f.delete()){
                   System.out.println("File is deleted");
               }
           }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
// CRUD: CREATE READ UPDATE DELETE