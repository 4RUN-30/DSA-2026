package BinarySearch;

public class SearchInRotatedArray2 {
    public boolean search(int[] arr, int key) {
        // code here
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                return true;
            }
            if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                high--;
                low++;
                continue;
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

        return false;
    }
}
