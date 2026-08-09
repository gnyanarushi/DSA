package august.aug2;

public class Demo {

    String name;
    public  Demo (String name){
        this.name = name;
    }

    public static void main(String[] args) {

        Demo d1 = new Demo("rishi");
        Demo d2 = d1;

        System.out.println(d1.name + " " + d2.name);


    }
}
