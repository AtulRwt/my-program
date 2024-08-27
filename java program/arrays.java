import java.util.*;
public class arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers :");
        int n=sc.nextInt();
        
        int num[]=new int [n];
        System.out.println("enter numbers :");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();

        }
        
        System.out.println("enter the number you want to find");
        int find=sc.nextInt();
        int get=-1;
        for(int i=0;i<num.length;i++)
        {
            if (num[i]==find) {
                get=i+1;
                break;
            }

        }
        if(get>-1)
            System.out.println("position of this number is"+get);
        else
            System.out.println("not found");
        
    }
}