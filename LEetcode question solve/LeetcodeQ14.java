import java.util.HashSet;

public class LeetcodeQ14{
    public static void union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<n2;j++){
            set.add(arr2[j]);
        }
        System.out.println(set.size()+"" +set);

    }
    public static void intersection(int arr1 [],int arr2 []){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> newset=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                newset.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        System.out.println(count+" "+newset);
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        
         intersection(arr1, arr2);

    }
}