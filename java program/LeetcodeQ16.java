import java.util.HashMap;

public class LeetcodeQ16{
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revmap=new HashMap<>();
        for(String key:tick.keySet()){
            revmap.put(tick.get(key),key);
        }
        for(String key:tick.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets=new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
        
        String start=getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start=tickets.get(start);
        }
        System.out.println(start);

    }
}