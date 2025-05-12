import java.util.*;
public class Union {
    public static void main(String[] args) {
    //   int[] num1={1,2,3,4,5};
    //   int[] num2={0,2,3,5,6,7};
     
    //   int n=num1.length;
    //   int m=num2.length;
    //   HashSet<Integer>set=new HashSet<>();
    //   for(int num:num1){
    //     set.add(num);
    //   }
    //   for(int num:num2){
    //     set.add(num);
    //   }
    //   ArrayList<Integer>l=new ArrayList<>();
    //   for(int i:set){
    //     l.add(i);
    //   }
    //   System.out.println(l);
    //   System.out.println(set);
      //Using two pointer approach
        ArrayList<Integer> num1 = new ArrayList<>(List.of(1, 2, 2, 3, 4));
        ArrayList<Integer> num2 = new ArrayList<>(List.of(0,2, 3, 5, 6));
        ArrayList<Integer> nums = new ArrayList<>();

        int n = num1.size();
        int m = num2.size();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (num1.get(i) <= num2.get(j)) {
                if (!nums.contains(num1.get(i))) {
                    nums.add(num1.get(i));
                }
                i++;
            } else {
                if (!nums.contains(num2.get(j))) {
                    nums.add(num2.get(j));
                }
                j++;
            }
        }

        // Add remaining elements from num1
        while (i < n) {
            if (!nums.contains(num1.get(i))) {
                nums.add(num1.get(i));
            }
            i++;
        }

        // Add remaining elements from num2
        while (j < m) {
            if (!nums.contains(num2.get(j))) {
                nums.add(num2.get(j));
            }
            j++;
        }

        System.out.println(nums);
    }
}

   