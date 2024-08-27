public class LeetCodeques12{
    public static int atoi(String str){
        if(str==null && str.length()==0){
            return 0;
        }
        int result=0;
        int sign=1;
        int i=0;

        while(i<str.length() && Character.isWhitespace(str.charAt(i))){
            i++;
        }
        if(i<str.length() && (str.charAt(i)=='+' || str.charAt(i)=='-')){
            sign=(str.charAt(i++)=='-') ? -1: 1;
        }
        while(i<str.length() && Character.isDigit(str.charAt(i))){
            int digit=str.charAt(i++)-'0';
            if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit>7)){
                return (sign==1) ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            result = result*10+digit;
        }
        return result*sign;
    }
    public static void main(String args[]){
        String str="1234";
        int num=atoi(str);
        System.out.println("the integer value is");
        System.out.println(num);
    }
}