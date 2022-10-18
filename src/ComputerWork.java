public class ComputerWork {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.id = 10;
        c1.prize = 1212;
        c1.name = "MSI";

        Computer c2 = new Computer();
        c2.name = "Apple";
        c2.prize = 112212;
        c2.id = 11;

        c1.display();
        c2.display();
    }
}
class Computer{
    int id;
    String name;
    double prize;

    void display(){
        System.out.println("Computer ID: "+this.id);
        System.out.println("Computer Name: "+this.name);
        System.out.println("Computer Prize: "+this.prize);
        System.out.println("---------------------------------");
    }
}
