class Sqtrt{
    public static void main(String[] args){
        int x=28;
        System.out.println(mySqrt(x));
    }
       static int mySqrt(int x) {
        int low=1;
        long high=x;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==(int)x){
                return (int)(mid);
            }
            else if((mid*mid)>x){
                high=(int)(mid-1);

            }
            else{
                low=(int)(mid+1);
            }
        }
        return (int) high;
    }
    
}