import java.util.ArrayList;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids={5,10,-5};
        asteroidCollision(asteroids);


    }
       static public void asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                l.add(asteroids[i]);
            }
            else{
          while(!l.isEmpty() && l.get(l.size()-1)>0 && l.get(l.size()-1) < Math.abs(asteroids[i])){
                 l.remove(l.size()-1);
           
            }
            if(!l.isEmpty() && l.get(l.size()-1)==Math.abs(asteroids[i])){
                l.remove(l.size()-1);
                
            }
            else if(l.isEmpty() || l.get(l.size()-1)<0){
                l.add(asteroids[i]);
            }
          
        }
        }
          
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
         
    }
}
