import java.util.Scanner;

public class quickSort{
    public static int partition(int arr[],int low ,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quickSorting(int arr[],int low , int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSorting(arr, low, pivotIndex-1);
            quickSorting(arr, pivotIndex+1, high);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the array: ");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        quickSorting(arr, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}