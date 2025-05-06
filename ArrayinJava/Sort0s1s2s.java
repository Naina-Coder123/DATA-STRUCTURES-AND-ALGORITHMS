import java.util.Arrays;
import java.util.Scanner;

public class Sort0s1s2s {
      // Function to sort an array of 0s, 1s, and 2s
      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
       // sort(arr, n);
       // using bruteforce O(NLOGN)
     //  Arrays.sort(arr);
     //now optimal solution O(N)
    //  int countZeroes=0;
    //  int countOnes=0;
    //  int countTwos=0;

    //  for(int i=0;i<n;i++){
    //     if(arr[i]==0){
    //         countZeroes++;
    //     }else if(arr[i]==1)
    //         countOnes++;
    //         else
    //         countTwos++;
        
    //  }
    
    //  for(int i=0;i<countZeroes;i++){
    //     arr[i]=0;
    //  }
    //  for(int i=countZeroes;i<countOnes+countZeroes;i++){
    //     arr[i]=1;

    //  }
    //  for(int i=countZeroes+countOnes;i<n;i++){
    //     arr[i]=2;
    //  }
      


    //Now implementing the DUTCH NATIONAL FLAG ALGORITHM
    //what the idea is dnf algorithm says that 0 will reside from 0 to l-1 ,1 will reside from l to mid -1 ,2 will reside from high+1 to n-1
// now place left in the array is m to high so unsorted part of the array will lie here only
  //but currently the whole array is unsorted so the mid will point to 0 and high will point to n-1;
  //and low is also pointing to 0
  int low=0;
  int mid=0;
  int high =n-1;
  while(mid<=high){
    if(arr[mid]==0){
        int temp=arr[mid];
        arr[mid]=arr[low];
        arr[low]=arr[mid];
        mid++;
        low++;
    }
    else if(arr[mid]==1){
    mid++;
    }
    else{
        int temp=arr[high];
        arr[high]=arr[mid];
        arr[mid]=temp;
        high--;
    }
  }
  for(int i=0;i<n;i++){
    System.out.println(arr[i]+" ");
}
}
      
    
    // public static void sort(int[] arr,int n){
                

     
    //     for(int i=0;i<n;i++){
    //         int min=arr[i];
    //         int index=i;
    //         int loc=i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]<min){
    //                 min=arr[j];
    //                 loc=j;
    //             }
    //         }
    //         int temp=arr[index];
    //         arr[index]=arr[loc];
    //         arr[loc]=temp;
    //     }
    // }

}
