package basicPractice.CodeChef.Numbers;

public class FractionToRecurringDecimal {

    public static void main(String[] args) {

        int numerator = 4;
        int denominator = 333;
        decimal((float) numerator / (float) denominator);
    }

    private static void decimal(float v) {

        String convertedString = Float.toString(v);

        StringBuilder modifiedString = new StringBuilder();
        for(char i : convertedString.toCharArray()){
                if(i == '.'){
                    break;
                }
                modifiedString.append(i);
        }
            modifiedString.append(".");
        System.out.println(modifiedString);
        
    }
}
