public class Works {
    public static void main(String[] args) {
        // CREATE A METHOD THAT ADD ALL NUMBER BETWEEN INTERVALS
        // For e.g addall(1, 5) : 1 + 2 + 3 + 4 + 5;
        add(10,15);
    }

    public static void add(int first, int last){
        int total = 0;
        for(int i=first; i<=last; i++){
            total+=i;
        }
        System.out.println("Total is "+total);
    }
}
