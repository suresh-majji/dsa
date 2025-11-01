import java.util.Arrays;

public class TwoPartition {
    public static void main(String[] args) {

        int[] a = {2,5,1,6,7,8,4};

        int f =0, pivot = a[a.length-1];

        for(int c = 0 ; c < a.length; c++){
            if(a[c] <= pivot) {
                int tmp = a[f];
                a[f] = a[c];
                a[c] = tmp;
                f++;
            }
        }

        Arrays.stream(a).forEach(System.out::println);

    }
}
