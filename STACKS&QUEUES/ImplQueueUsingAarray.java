public class ImplQueueUsingAarray {
   static int currSize=0;
    static int start=-1;
   static int end=-1;
   static int[] queue=new int[4];
    public static void main(String[] args) {
        push(5);
        push(9);
        pop();
        push(2);
        top();
        pop();
        push(8);
        top();
        Size();
    }
    static void push(int element){
        if(start==end+1){
            System.out.println("Queue is full,cannot push!");
            return;
        }
        if(start==-1 && end==-1){
            start=0;
            end=0;
        }
        else if(end==queue.length-1){
            end=0;

        }
        else{
            end=end+1;
        }
      queue[end]=element;
      currSize+=1;

    }

    static void pop(){
        //Underflow condition
        if(start==-1){
            System.out.println("Queue is empty , cannot pop!");
            return;
        }
        if(end==start){
            int x=queue[start];
            start=end=-1;
        }
        else if(start==queue.length-1){
            int x=queue[start];
            start=0;
        }
        else{
            int x=queue[start];
            start=start+1;
        }
        currSize-=1;
    }
    static void Size(){
System.out.println(currSize);
    }
    static void top(){
        if(currSize==0){
            System.out.println("Queue is empty,cannot access!");
            return;
        }
        System.out.println(queue[start]);
    }
    
}
