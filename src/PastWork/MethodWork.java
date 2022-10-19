package PastWork;

public class MethodWork {

    public static void main(String[] args) {
//        printName(); //method calling
//        interestCalculator(5000,6,4);
//        interestCalculator(65000,2,3);

//       String pmName =  primeMinister();
//        System.out.println(pmName);
//        int ramAge = 20;
//
//        if(ramAge >= voterAge()){
//            System.out.println("You are voter.");
//        }

       int total = add(10,20,30);
        System.out.println("Total is "+total);
    }
    // method declare.
    // - No Parameter and No Return Type
    public static void printName(){
        System.out.println("Hello I am BRP from method.");
    }
    // Parameter and No Return Type
    public static void interestCalculator(double p, double t, double r){
       double si = p * t * r / 100;
       System.out.println("The simple interest is "+si);
    }
    // - Parameter and Return Type

    public static int add(int n1, int n2, int n3){
        return (n1+n2+n3);
    }

    //  No Parameter and Return Type
    public static String primeMinister(){
        return "Joe Biden";
    }

    public static int voterAge(){
        return 18;
    }


}

