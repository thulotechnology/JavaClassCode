public class AnimalWork {
    public static void main(String[] args) {
        Animal cow = new Animal();
        cow.color = "Black";
        cow.name = "ABCow";
        cow.id = 1;

        Animal hen = new Animal();
        hen.id = 2;
        hen.name = "Hhen";
        hen.color = "Red";

        Animal goat = new Animal();
        goat.id = 3;
        goat.name = "Abgoat";
        goat.color = "brown";

        cow.display();
        hen.display();
        goat.display();
    }
}

class Animal{
    // Properties
    int id;
    String name;
    String color;

    void display(){
        System.out.println("-------------------------------------");
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Color: "+this.color);
    }
}
