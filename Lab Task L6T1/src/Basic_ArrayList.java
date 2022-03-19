import java.util.ArrayList;
import java.util.Collections;

public class Basic_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> Jlt = new ArrayList<>();
            Jlt.add(8);
            Jlt.add(4);
            Jlt.add(3);
            Jlt.add(1);
        System.out.println(Jlt);
            //replace
            Jlt.set(1,100);
        System.out.println("After replace :" +Jlt);
            //get a specific element in ArrayList
        System.out.println("In the index of 1 is" +Jlt.get(1));
            //remove a element in ArrayList
            Jlt.remove(1);
        System.out.println("After removal : " +Jlt);
            //get the size of an ArrayList
        System.out.println("Element size : " +Jlt.size());

        //loop through an ArrayList
            int j=1;
        System.out.println("---------------");
            for(int i:Jlt) {
                System.out.println(j + " element is " + i);
                j++;
            }
        System.out.println("---------------");
            //sorting an ArrayList
        Collections.sort(Jlt);
            //
        System.out.println("Sorted ArrayList :"+Jlt);

    }
}

