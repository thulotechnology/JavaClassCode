public class MacBook {
    public static void main(String[] args) {
    Phone p = new Phone();
    p.setId(1);
    p.setName("Bimal");
    p.setPrize(-50);

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrize());
    }
}

class Phone{
    private int id;
    private String name;
    private double prize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        if(prize<0){
            System.out.println("Error while prize set.");
        }else{
            this.prize = prize;
        }

    }
}
