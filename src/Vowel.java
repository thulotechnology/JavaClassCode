public class Vowel {
    public static void main(String[] args) {

        char letter = 'a';


        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Letter is vowel.");
                break;
            default:
                System.out.println("Letter is consonant.");
        }

    }
}
