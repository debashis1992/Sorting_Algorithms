import java.util.Arrays;

/**
 * Created by debashis on 1/2/2017.
 */
public class Program_QuickSort {
    public static void main(String[] args) {
        int[] a = {4,1,45,73,8,5,99,3};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(a));
        QuickSort algorithm = new QuickSort();
        algorithm.sort(a);

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(a));

     }

}
class QuickSort {
    private int[] ar;
    private int length;
    public void sort(int[] ar) {
        if(ar==null || ar.length==0)
            return;

        this.ar = ar;
        this.length = ar.length;
        _quickSort(0,length-1);
    }
    private void _quickSort(int low,int high) {
        int i = low;
        int j = high;
        //pivot is the middle index
        int pivot = ar[low + (high - low)/2];
        //Dividing into two parts
        //System.out.println(pivot);
        while(i<=j) {
            while(pivot<ar[j])
                j--;
            while(pivot>ar[i])
                i++;
            if(i<=j) {
                swap(i,j);
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(i+" "+j);
        if(low<j)
            _quickSort(low,j);
        if(i<high)
            _quickSort(i,high);
    }
    private void swap(int a,int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
