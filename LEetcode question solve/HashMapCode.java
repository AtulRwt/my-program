import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value) {
                this.key=key;
                this.value=value;
            }
        }
        private int N;
        private int n;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){        //0-n-1
            int bi=key.hashCode();
            return Math.abs(bi) % N;
        }


        private int searchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            for(int k=0;k<ll.size();k++){
                if(ll.get(k).key==key){
                    return k;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldbucket[]=buckets;
            buckets=new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }

            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node> ll=oldbucket[i];
                for(int j=0;i<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private void put(K key,V value){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){     //key doesnt exists
                buckets[bi].add(new Node(key, value));
                n++;
            }else{          //key exists
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public V get (K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){     //key doesnt exists
                return null;
            }else{          //key exists
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){     //key doesnt exists
                return false;
            }else{          //key exists
                return true;
            }
        }

        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){     //key doesnt exists
                return null;
            }else{          //key exists
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> keyset(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j--);
                    keys.add(node.key);
                    
                }
            }
            return keys;
        }



    }
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put( "india", 100);
        map.put("USA", 50);
        map.put("china", 150);
        ArrayList<String> keys=map.keyset();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}