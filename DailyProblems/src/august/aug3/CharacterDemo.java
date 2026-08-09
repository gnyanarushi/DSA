package august.aug3;

public class CharacterDemo {
    public static void main(String[] args) {

        System.out.println(Integer.parseInt("0c14" , 16));
        System.out.println((char) Integer.parseInt("0c14" , 16));

        // java uses unicode format for the internationalization with all the languages
        // that is the reason it takes two bytes of storage

        System.out.printf("%hu" , -1);
    }
}
