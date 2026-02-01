package BinarySearch;

public class SearchInRotatedSortedArray1 {
    int search(int[] arr, int key) {
        // code here
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            // System.out.println("Low : "+low + " High : "+high);
            if(arr[mid] == key){
                return mid;
            }
            if(arr[high] >= arr[mid]){
                if(key<=arr[high] && key>=arr[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
            else{
                if(key>=arr[low] && key<=arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }

        }

        return -1;
    }
}
