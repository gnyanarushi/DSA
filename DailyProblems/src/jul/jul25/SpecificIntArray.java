package jul.jul25;

public class SpecificIntArray {
    int[] arr ;
    public SpecificIntArray(int[] arr ){
        this.arr = arr;
    }
    public void printArray(){
        for(int i : arr )
            System.out.println(i + " ");
    }

    public  void reverseArray() {
        int i = 0 , j = arr.length -1 ;

        while(i <= j ){
            int temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++; j--;
        }

    }


    public static void main(String[] args) {
        int[] arr ={1 , 2 , 3 ,4 };
        SpecificIntArray specificIntArray = new SpecificIntArray(arr);
        specificIntArray.printArray();
        specificIntArray.reverseArray();
        specificIntArray.printArray();
    }

}
