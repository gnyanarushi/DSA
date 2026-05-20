package recursion;

public class NoBaseCase {

    public static void main(String[] args) {
        NoBaseCase noBaseCase = new NoBaseCase();
        noBaseCase.testWithBaseCondition(5);
    }


    // no base condition which leads to the stackoverflow error that outputbuffer stream is overflowed.
    public  void test(int n ) {
        System.out.println(n);
        test(n-1);
    }


    // the test recursive method with the base condition
    public void testWithBaseCondition(int n ){
        if(n == 0){
            return;
        }

        System.out.println(n);
        testWithBaseCondition(n-1);
    }
}
