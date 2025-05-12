 int res = 0;
        int k=scn.nextInt();
        Collections.sort(l);
        int diff=l.get(n-1)-l.get(0);
        for(int i=0;i<n;i++){
            if(l.get(i)+k<0){
                continue;
            }
            int minH=Math.min(l.get(0)+k,l.get(i)+k);
            int maxH=Math.max(l.get(n-1)-k, l.get(i)-k);
           res= Math.min(diff, maxH-minH);
        }