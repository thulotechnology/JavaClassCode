package PastWork;

public class PlanetWork {
    public static void main(String[] args) {
        Earth e = new Earth();
        e.size();
        e.radius();
    }
}

interface Planet{
    void radius();


}

interface Galexy{
   void size();
}

class Earth implements Planet, Galexy {
    public void radius(){
        System.out.println("Radius is 2000");
    }

    public void size(){
        System.out.println("Size is is 2000");
    }

}
