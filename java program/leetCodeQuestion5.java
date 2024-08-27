public class leetCodeQuestion5{
    public static String palandrome(String s){
        if(s.length()<=1){
            return s;
        }
        
        int maxLen=1;
        String maxStr=s.substring(0, s.length());

        for(int i=0;i<s.length();i++){
            for(int j=i+maxLen;j<=s.length();j++){
                if(j-i>maxLen && isPalandrome(s.substring(i, j))){
                    maxLen=j-1;
                    maxStr=s.substring(i, j);
                }
            }
        }
        return maxStr;
    }
    public static boolean isPalandrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            
            left++;
            right--;
        }   
        return true;

    }
    public static void main(String args[]){
        String str="radar";
        String result=palandrome(str);
        System.out.println(result);
    }
}
