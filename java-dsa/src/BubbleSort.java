import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={9,6,2,4,3,1};
        int n = arr.length;
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < i ; j++) {
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
