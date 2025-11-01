import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={9,66,2,4,23,1};
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
