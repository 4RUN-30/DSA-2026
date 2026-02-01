package BinarySearch;

public class SortedAndRotatedMinimum {
    public int findMin(int[] arr) {
        // complete the function here
        int ans = Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == arr[low]){
                ans = Math.min(arr[mid],ans);
                low = mid + 1;
            }
            else if(arr[mid] < arr[low]){
                ans = Math.min(arr[mid],ans);
                high = mid -1;
            }
            else{
                ans = Math.min(arr[low],ans);
                low = mid + 1;
            }
        }

        return ans;
    }
}
