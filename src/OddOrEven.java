import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        // 2 le divide vayo vane - Even Hunxa Else Odd
        // Given no %2 garda 0 aayo vane - Even huxna Else Odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

       if(number>0){
           if(number %2 == 0){
               System.out.println("The number is even.");
           }else{
               System.out.println("The number is odd.");
           }
       }else{
           System.out.println("Number must be positive.");
       }
    }
}
