package PastWork;

public class FindGreat {
    public static void main(String[] args) {
        int n1 = 300;
        int n2 = 45;
        int n3 = 90;

        // No 1 great huna >> n1 > n2 and n1 > n3
        // No 2 great huna >> n2 > n1 and n2 > n3
        // No 3 great huna >> n3 > n1 and n3 > n2

        if(n1 > n2 && n1 >n3){
            System.out.println(n1+ " is great.");
        }else if(n2>n1 && n2> n3){
            System.out.println(n2+ " is great.");
        }else if(n3>n1 && n3 >n2){
            System.out.println(n3+ " is great.");
        }else{
            System.out.println("Something went wrong.");
        }

    }
}
