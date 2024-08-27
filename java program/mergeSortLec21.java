import java.util.Scanner;

public class mergeSortLec21{
    public static void merge(int arr[],int start,int mid,int last){
        int merger[]=new int[last-start+1];
        int index1=start;
        int index2=mid+1;
        int x=0;
        while (index1<=mid&&index2<=last) {
            if(arr[index1]<=arr[index2]){
                merger[x++]=arr[index1++];
            }else{
                merger[x++]=arr[index2++];
            } 
        }
        while(index1<=mid){
            merger[x++]=arr[index1++];
        }
        while(index2<=last){
            merger[x++]=arr[index2++];
        }
        for(int i=0,j=start;i<merger.length;i++,j++){
            arr[j]=merger[i];
        }
    }
    public static void sort(int arr[],int start,int last){
        if(start>=last){
            return;
        }
        int mid=start+(last-start)/2;
        sort(arr, start, mid);
        sort(arr, mid+1, last);
        merge(arr,start,mid,last);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        sort(arr, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}