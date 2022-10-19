package PastWork;

public class AbstractWork {
    public static void main(String[] args) {
    Honda h = new Honda();
    h.display();
    }
}
abstract class Bike{
    abstract void run();
    abstract void stop();
    public void display(){
        System.out.println("This is Bike Display.");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Honda is running....");
    }
    void stop(){
        System.out.println("Bike is stopped.....");
    }
}
