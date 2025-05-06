 int maxi=Integer.MIN_VALUE;
        //Optimised Approach O(N)
        for(int i=0;i<n;i++ ){
        sum+=l.get(j);
        if(sum>maxi){
        maxi=sum;
        }
        if(sum<0){
        sum=0;
        continue;
        }
        }
        return maxi;