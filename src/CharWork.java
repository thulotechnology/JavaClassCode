public class CharWork {
    public static void main(String[] args) {
        String name = "Apple";

        char firstLetter = name.toLowerCase().charAt(0);

        if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i'){
            System.out.println("Vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
