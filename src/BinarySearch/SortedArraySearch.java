package BinarySearch;

public class SortedArraySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(searchInSorted(arr,1));
        System.out.println(searchInSorted(arr,8));
        System.out.println(searchInSorted(arr,10));
        System.out.println(searchInSorted(arr,-1));

        System.out.println(searchInSortedRecursion(arr,1,0,arr.length-1));
        System.out.println(searchInSortedRecursion(arr,8,0,arr.length-1));
        System.out.println(searchInSortedRecursion(arr,10,0,arr.length-1));
        System.out.println(searchInSortedRecursion(arr,-1,0,arr.length-1));
    }

    static int searchInSorted(int[] arr, int target) {
        int high = arr.length-1;
        int low = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }

        return -1;
    }

    static int searchInSortedRecursion(int[] arr, int target,int low,int high) {
        if(low>high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return searchInSortedRecursion(arr,target,mid+1,high);
        }
        else{
            return searchInSortedRecursion(arr,target,low,mid-1);
        }
    }
}