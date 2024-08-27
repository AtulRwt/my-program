import java.util.ArrayList;
 
import java.util.Collections;

public class arrayListLec25{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
       // ArrayList<String> list2=new ArrayList<>();
       // ArrayList<Boolean> list3=new ArrayList<>();

       //add element to the list
       list.add(2);
       list.add( 3);
       list.add(4);

       //show the elements
       int element=list.get(0);
       System.out.println(element);

       //add element in between 
       list.add(0,1);
       System.out.println(list);

       //set element

       list.set(0, 3);
       System.out.println(list);

       //delete the element

       list.remove( 3);
       System.out.println(list);

       //size of the list

       System.out.println(list.size());

       //loops
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));
       }
       System.out.println();

       //sorting

       Collections.sort(list);
       System.out.println(list);


    }
}