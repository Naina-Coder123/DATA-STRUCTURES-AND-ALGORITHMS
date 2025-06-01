import java.util.*;
public class TypeOfTriangle {
    public static void main(String[] args) {
        int[] nums={3,3,3};
          Arrays.sort(nums);
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];

         if (a + b <= c) {
       // return "none";
       System.out.println("None");
    }

    // Now check for triangle type
    if (a == b && b == c) {
        //return "equilateral";
        System.out.println("equilateral");
    } else if (a == b || b == c || a == c) {
       // return "isosceles";
       System.out.println("isosceles");
    } else 
    System.out.println("scalene");
        //return "scalene";
    

    }
    
}
