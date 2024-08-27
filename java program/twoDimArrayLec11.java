import java.util.*;
public class twoDimArrayLec11{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            int c=sc.nextInt();
            int[][] array=new int[r][c];
            System.out.println("enter the"+r*c+"numbers");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    array[i][j]=sc.nextInt();

                }
            }
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                     System.out.print(array[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println("type the number to find ");
            int find=sc.nextInt();
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(array[i][j]==find)
                        System.out.print(" the number find at  ["+i+"]["+j+"]");

                }
                System.out.println();
            }
        }
}