
import java.util.*;
public class Solution{
    public static int [] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                } 
            }
        }
        return new int[]{};
        //time complexity=O(n^2)
    }
    public static void main(String args[]){
        int target=6;
        int[] nums={3,2,4};
        int [] result=twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}