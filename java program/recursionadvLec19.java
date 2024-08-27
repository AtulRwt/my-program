public class recursionadvLec19{
    public static void printPermutation(String str ,String permutation)
    {
        for(int i=0;i<str.length();i++)
        {
            char curchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr,permutation+curchar);

        }
    }
    public static void main(String args[])
    {
        String str="abc";
        printPermutation(str,"");
    }
}