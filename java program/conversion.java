import java.util.Scanner;

public class conversion{
    public static int toDecimal(int binary)
    {
        int decimal=0;
        int n=0;
        while (true){
            if(binary==0){
                break;
            }else{
                int temp=binary%10;
                decimal+=temp*Math.pow(2,n);
                binary=binary/10;
                n++;
            }
        }
        return decimal;
    }
    public static void toBinary(int decimal)
    {
        int binary[]=new int [40];
        int index=0;
        while (decimal>0){
            binary[index++]=decimal%2;
            decimal=decimal/2;
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 for binary to decimal ");
        System.out.println("press 2 for decimal to binary ");
        int num=sc.nextInt();
        if (num==1) {
            System.out.println("enter the binary");
            int a=sc.nextInt();
            System.out.println("decimal of "+a+" is"+toDecimal(a));
        }
        else{
            System.out.println("enter the decimal");
            int a=sc.nextInt();
            System.out.println("decimal of "+a+" is");
            toBinary(a);
        }
    }
}