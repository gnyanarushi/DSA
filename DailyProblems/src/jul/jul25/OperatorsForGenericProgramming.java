package jul.jul25;

public class OperatorsForGenericProgramming {
    public static void main(String[] ar) {


//        for(int i = 0 ; i < ar.length ; i++){
//            System.out.println(ar[i]);
//        }


    varargs("Rishi" , 789  , 56 , 67.90 , "hello "  , true );

    }


    public  static  void varargs(Object ...obj){
        for (Object o : obj ) {
            System.out.println(o.toString());
        }
    }
}
