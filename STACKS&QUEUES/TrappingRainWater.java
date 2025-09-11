public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int result=trap(height);
        System.out.println(result);
    }
     static public int trap(int[] height) {
        //bruteforce approach
        //time -O(2N) space-O(2N)
        // int[] prefix=new int[height.length];
        // int[] suffix=new int[height.length];
        // //computing prefix sum
        // prefix[0]=height[0];
        // for(int i=1;i<height.length;i++){
        //     prefix[i]=Math.max(prefix[i-1],height[i]);
        // }
        // //computing suffix sum
        // suffix[height.length-1]=height[height.length-1];
        // for(int i=height.length-2;i>=0;i--){
        //     suffix[i]=Math.max(suffix[i+1],height[i]);
        // }

        // int total=0;
        // for(int i=0;i<height.length;i++){
        //     int leftMax=prefix[i];
        //     int rightMax=suffix[i];
        //   if(height[i]<leftMax && height[i]<rightMax){
        //     total+=Math.min(leftMax,rightMax)-height[i];
        //   }
        
        // }
        // return total;
        //optimal solution time- O(N) space-O(1)
        int leftmax=0;
        int rightmax=0;
        int l=0;
        int r=height.length-1;
        int total=0;
        while(l<r){
            if(height[l]<height[r]){
                if(leftmax>height[l]){
                    total+=leftmax-height[l];
                }else{
                    leftmax=height[l];
                }
                    l=l+1;

            }else{
                if(rightmax>height[r]){
                    total+=rightmax-height[r];
                 }else{
                    rightmax=height[r];
                 }
                   r=r-1;
            }
                  

        }
        return total;


    }
}
