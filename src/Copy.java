public class Copy {
    // Fields
    int id;
    String name;
    double prize;

    // Constructor
    Copy(int id, String name, double prize){
        this.id = id;
        this.name = name;
        this.prize = prize;
    }


    // method
    void display(){
        System.out.println("ID is "+this.id);
        System.out.println("Name is "+this.name);
        System.out.println("Prize is "+this.prize);
    }
}
