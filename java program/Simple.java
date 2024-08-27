import java.util.Scanner;

class Simple
{
    public static void main(String args[])
    {
        System.out.println("atul rawat");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 2 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int button=sc.nextInt();
        switch (button) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("invalid button");
                break;
        }  
        sc.close();
    }
}