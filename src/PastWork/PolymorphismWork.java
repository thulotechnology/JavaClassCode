package PastWork;

public class PolymorphismWork {
    public static void main(String[] args) {
        Boya b = new Boya();
        b.sound();

        Rode r = new Rode();
        r.sound();
    }
}

class Mic{
    String color;
    int id;

}

class Boya extends Mic{
    void sound(){
        System.out.println("Quality Sound From Boya");
    }
}

class Rode extends Mic{
    void sound(){
        System.out.println("Quality sound from Rode.");
    }
}
