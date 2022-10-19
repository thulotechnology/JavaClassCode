package PastWork;

public class DayFinder {
    public static void main(String[] args) {
        int noOfDay = 17;
// WAP IN JAVA TO FIND MONTH NAME BY NO OF MONTH.
        if(noOfDay == 1){
            System.out.println("Day is sun.");
        }else if(noOfDay == 2){
            System.out.println("Day is mon.");
        }else if(noOfDay == 3){
            System.out.println("Day is tue.");
        }else if(noOfDay == 4){
            System.out.println("Day is wed.");
        }else if(noOfDay == 5){
            System.out.println("Day is thu.");
        }else if(noOfDay == 6){
            System.out.println("Day is fri.");
        }else if(noOfDay == 7){
            System.out.println("Day is sat.");
        }else{
            System.out.println("Invalid day no.");
        }
    }
}
