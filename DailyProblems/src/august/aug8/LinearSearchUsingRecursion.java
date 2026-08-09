package august.aug8;

import javax.swing.text.StyledEditorKit;

public class LinearSearchUsingRecursion {

    public static void main(String[] args) {
        int[] arr = { 15 , 6  , 78 , 43 , 45 , 78 , 94 } ;
        System.out.println(linearSearchIndex(arr , 94 , 0));
    }

    static  boolean  linearSearch(int[] arr , int target , int index ){
        if(index ==  arr.length - 1){
            return false;
        }

        return  arr[index] == target || linearSearch(arr , target , index + 1 ) ;
    }

    static  int  linearSearchIndex(int[] arr , int target , int index ){
        if(index ==  arr.length ){
            return -1;
        }

        if(arr[index] == target){
            return index ;
        }
        return    linearSearchIndex(arr , target , index + 1 ) ;
    }
}
