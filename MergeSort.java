import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int arr[], int left, int right) {
        if(left < right){
            int mid = left + (right - left)/2;
            // System.out.println(mid);

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        //comparing element and storing in the temporary array
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left ++;
            }
            else{
                temp.add(arr[right]);
                right ++;
            }
        }
        // System.out.println(left);
        // System.out.println(right);
        // System.out.println();

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }

    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Origional Array : " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
