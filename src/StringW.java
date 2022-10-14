public class StringW {
    public static void main(String[] args) {
        String names = "pokhara;kathmandu;texas";
        String[] datas = names.split(";");

        for(int i=0; i<=2; i++){
            System.out.println(datas[i]);
        }
    }
}
