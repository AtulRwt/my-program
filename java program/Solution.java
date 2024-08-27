public class Solution{
    public static int findLongestSubstring(String s){
        if(s==null||s.length()==0){
            return 0;
            
        }
        int start=0;
         int [] charIndex=new int[128];
         int maxLength=0;
         for(int end=0;end<s.length();end++){
            char currentChar=s.charAt(end);
            start =Math.max(charIndex[currentChar], start);
            charIndex[currentChar]=end+1;
            maxLength=Math.max(end-start+1, maxLength);
         }
         return maxLength;
    }
    public static void main(String args[]){
        String s="abcabcd";
        int result=findLongestSubstring(s);
        System.out.println("the length of longest substring is: "+result);
        
    }
}