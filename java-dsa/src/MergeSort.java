import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {2,5,8,9,10};
        int[] b = {0,4,5,19};

        ArrayList<Integer> list = new ArrayList<>(a.length+b.length);

        int i=0,j = 0, n = a.length, m = b.length;

        while( i < n || j < m) {
            if( i < n && j < m) {
                if( a[i] <= b[j]) {
                    list.add(a[i]);
                    i++;
                }else {
                    list.add(b[j]);
                    j++;
                }
            } else if ( i < n) {
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }

        list.stream().forEach( System.out::println);
    }
}
