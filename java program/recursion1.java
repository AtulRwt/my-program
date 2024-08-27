import java.util.*;

public class recursion1{
    public static void findSum(int x,int y,int sum){
        if(x==y){
        sum=sum+x;
        System.out.println(sum);
        return;
        }
         sum=sum+x;
        findSum(x+1, y, sum);
    }
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return factorial(n-1)*n;
    }
    public static void fibbo(int a,int b,int term){
        if(term==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibbo(b, c, term-1);
        
    }
    public static int powerXn(int x,int n)
    {
        if(n==0)
        {
            return 1;

        }
        else if(x==0)
        {
            return 0;    
        }
        int xpower_1=powerXn(x, n-1);
        int xpower=x*xpower_1;
        return xpower;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=powerXn(x, n);
        System.out.println(ans);
    }
}