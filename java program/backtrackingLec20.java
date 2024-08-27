public class backtrackingLec20{
    public static void printPermutation(String str,String perm,int index){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPermutation(newString, perm+currchar, index+1);
        }
        //NOTE: time complexity=O(n*n!)
    }
    public static void main(String args[]){
        String str="ABC";
        printPermutation(str,"", 0);
        
    }
}