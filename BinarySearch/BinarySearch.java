public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 8 };
        int target = 7;
     int n = arr.length;
     System.out.println(binarySearch(arr,n,target));
    }

       
   static int binarySearch(int[] arr,int n,int target){
         int left = 0;
        int right = n - 1;
        int mid=0;
        while (left <= right) {
             mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    return -1;

    }
}