import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String args[]){
        //creation
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        //size
        System.out.println("size of set is "+ set.size());
        //print all elements
        System.out.println(set);

        //iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        

        


    }
}