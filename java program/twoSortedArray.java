import java.util.Arrays;

public class twoSortedArray{
    public static double median(int[] nums1,int [] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int [] sorting=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            sorting[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            sorting[k++]=nums2[i];
        }
        Arrays.sort(sorting);
        int size=sorting.length;
        if(size%2==1){
            return (double)sorting[size/2];
        }
        else{
            int middle1=sorting[size/2-1];
            int middle2=sorting[size/2];
            return ((double) middle1+(double)middle2)/2.0; 
        }

    }
    public static void main(String args[]){
        int [] nums1={4,5,6};
        int[] nums2={1,2,3};
        System.out.println(median(nums1, nums2));
    }
}