public class AbstractWork {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
}

abstract class Bike{
    abstract void run();
    abstract void stop();
}

class Honda extends Bike{
    void run(){
        System.out.println("Honda is running....");
    }
    void stop(){
        System.out.println("Bike is stopped.....");
    }
}
