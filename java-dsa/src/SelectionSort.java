import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr ={9,66,2,4,23,1};

        for(int i =0; i < arr.length; i++) {
            int smallElementIndex = i;
            for( int j=i; j < arr.length; j++){
                if(arr[j] < arr[smallElementIndex]) {
                    smallElementIndex = j;
                }
            }
            int temp = arr [i];
            arr[i]  = arr[smallElementIndex];
            arr[smallElementIndex] = temp;
        }

        Arrays.stream(arr).forEach(System.out::println);

    }
}
