import java.util.Arrays;

/**
 * Created by debashis on 1/2/2017.
 */
public class Program_SelectionSort {
    public static void main(String[] args) {
        int[] a = {4,1,45,73,8,5,99,3};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(a));
        _selectionSort(a);
    }
    static void _selectionSort(int[] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(a));
    }
}
