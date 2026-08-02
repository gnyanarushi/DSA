package jul.jul26;

public class StaticGenerics {

    static <T>  void gsPrint(T t ) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        gsPrint(10);
        gsPrint(34);
    }
}
