package PastWork;

public class MethodWo {
    public static void main(String[] args) {
    intervals(20,30);
    intervals(50,70);
    intervals(500,7000);
    }

    public static void intervals(int start, int end){
        System.out.println("Even numbers between "+start + " and "+end + " are: ");

        for(int i=start; i<=end; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
