package PastWork;

public class City {
    public static void main(String[] args) {
        // WAP TO PRINT 10 DIFFERENT CITY
        String[] cities = {"london",  "Lahore", "Shangai", "Toronto","Pokhara"};
        cities[4] = "Texas";

        for(int i=0; i<cities.length; i++){
            if(cities[i] == "Lahore" || cities[i] =="Pokhara"){
                continue;
            }
            System.out.println(cities[i]);
        }

//        for(String c: cities){
//            System.out.println(c);
//        }
//        int[] weather = {20,21,22,23,24};
//
//
//       for(int i=0; i< cities.length; i++){
//           System.out.println(cities[i] + " weather is "+ weather[i] +" d. celcius.");
//       }
// Add 5 Friends name to array and print all using loop.

    }
}
