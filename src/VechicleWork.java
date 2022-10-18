public class VechicleWork {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setModel("Tesla");
        v.setYear(1990);

        System.out.println(v.getModel());
        System.out.println(v.getYear());
    }
} // Create a class Bus. Create private fields model, year
// Create getter and setter
// print object fields
class Vehicle{
    private String model;
    private int year;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <2000){
            System.out.println("Error");
        }else{
            this.year = year;
        }
    }
}
