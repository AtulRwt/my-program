import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public  class Hashing
{
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("india", 120);
        map.put("US", 30);
        map.put("china", 150);
        System.out.println(map);

        //update
        map.put("china", 180);
        System.out.println(map);
        
        //search
        if(map.containsKey("Indonesia")){
            System.out.println("key is present");
        }else{
            System.out.println("key is not present");
        }

        //print the map
        System.out.println(map.get("china"));
        System.out.println(map.get("indoneasia"));

        //print by forloop
        int arr[]={12,13,14};
        for(int val:arr){
            System.out.print(val +" ");
        }
        System.out.println();

        //print by entry set
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());  //for key
            System.out.println(e.getValue());  //for value
        }
        

        //print by keyset
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key +" "+map.get(key));
        }

        //remove the key 
        map.remove("china");
        System.out.println(map);
    }
}