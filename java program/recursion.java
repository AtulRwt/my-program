import java.util.*;

public class recursion1{
    public static void find(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        find(a-1);
    }
    public static void main(String args[]){
        int a=5;
        find(a);
    }
}