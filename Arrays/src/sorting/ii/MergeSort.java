    package sorting.ii;


    import java.util.ArrayList;
    import java.util.Arrays;

    public class MergeSort {
        public static void main(String[] args) {

            int[] arr = { 5 ,4 ,3 ,2 ,1 };

            mergeSort(arr ,0  , arr.length -1 );
            System.out.println(Arrays.toString(arr));

        }

        public static void mergeSort(int[] arr , int low , int high ) {
            if( low >= high ) return;

            int mid  = low + (high - low)/2;

            mergeSort(arr , low , mid );
            mergeSort(arr , mid + 1 , high);
            merge(arr , low , mid , high ) ;
        }

        public  static  void  merge(int[] arr , int  low ,int mid , int high ){
            int left = low ;
            int right = mid+1 ;
            int[] temp = new int[high - low + 1 ];
            int k = 0;
            while(left <= mid && right <= high){
                if(arr[left] <= arr[right]){
                    temp[k] = arr[left]; k++; left++;
                }

                else{
                    temp[k] = arr[right];
                    k++; right++;
                }

            }

            while (left <= mid){
                temp[k] = arr[left];
                k++; left++;
            }

            while (right <= high){
                temp[k] = arr[right];
                k++; right++;
            }

//            for(int i = low ; i <= high ; i++){
//                arr[i] = temp[i - low];
//            }

            for(int i = 0 ; i <  temp.length ; i++){
                arr[i+low] = temp[i];
             }

        }
    }
