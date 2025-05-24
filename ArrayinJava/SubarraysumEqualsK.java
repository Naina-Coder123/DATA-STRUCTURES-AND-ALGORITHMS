import java.util.*;

public class SubarraysumEqualsK {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int n = arr.length;
        long sum = 0;
        int count = 0;
        int k = 2;
        HashMap<Long, Integer> prefix = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                count++;

            }
            long rem = sum - k;
            // if(prefix.containsKey(rem)){
            // count+=prefix.get(rem);

            // }
            // prefix.put(sum,prefix.getOrDefault(sum,0 )+1);
            if (prefix.containsKey(rem)) {
                count += prefix.get(rem);
            }

            // Update prefix sum count
            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);

        }
        System.out.println(count);
    }
}
