import java.util.*;
public class bitManupulation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=5;
        int pos=1;
        int bitmask=1<<pos;
        System.out.println("choose 1 for clear or chose 0 for set operation");
        int oper=sc.nextInt();
        if (oper==1) {
            int newnum=bitmask|a;
            System.out.println(newnum);
            
        }else{
            int newbitmask=~(bitmask);
            int newnum=newbitmask&a;
            System.out.println(newnum);
        }
    }
}