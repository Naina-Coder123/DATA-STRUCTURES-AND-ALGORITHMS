import java.util.*;
public class Priyanka {
    public static void main(String[] args){

        List<Integer>w=new ArrayList<>();
     w.add(1);
     w.add(2);
    w.add(3);
    w.add(21);
    w.add(7);
     w.add(12);
    w.add(14);
    w.add(21);
    Collections.sort(w);
    int containers = 0;
    int i = 0;
    List<List<Integer>> containerToys = new ArrayList<>();
    
    while (i < w.size()) {
        int minWeight = w.get(i);
        containers++;
        List<Integer> currentContainer = new ArrayList<>();
        
        while (i < w.size() && w.get(i) <= minWeight + 4) {
            currentContainer.add(w.get(i));
            i++;
        }
        containerToys.add(currentContainer);
    }
    System.out.println("Number of containers: " + containers);
    for (int j = 0; j < containerToys.size(); j++) {
        System.out.print("Container " + (j + 1) + " will contain these toys: ");
        for (int toy : containerToys.get(j)) {
            System.out.print(toy + " ");
        }
        System.out.println();
    }
   System.out.println(containers);
}

    
}
