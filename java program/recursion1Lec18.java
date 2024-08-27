import java.util.HashSet;

public class recursion1Lec18
{ 
    public static int first=-1;
    public static int last=-1;

    public static void LastOccur(String a, int index,char element){
        if(index==a.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar=a.charAt(index);
        if (currentchar==element) {
            if(first==-1)
            {
                first=index;

            }
            else{
                last=index;
            }
        }
        LastOccur(a, index+1, element);
    }
    public static boolean sorted(int a[],int index){
        if(index==a.length-1){
            return true;
        }
        if(a[index]>=a[index+1])
        {
            return false;
        }
        return sorted(a, index+1);

    }
    public static void movestring(String str,int index,int count,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currentcharacter=str.charAt(index);
        if(currentcharacter=='x'){
            count++;
            movestring(str, index+1, count, newString);
        }
        else{
            newString+=currentcharacter;
            movestring(str, index+1, count, newString);
        }
    }
    public static boolean[] map=new boolean[26];
    public static void remDuplicates(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return ;
        }
        char currentchar=str.charAt(index);
        if(map[currentchar-'a']==true){
            remDuplicates(str, index, newString);
        }else{
            newString+=currentchar;
            map[currentchar-'a']=true;
            remDuplicates(str, index+1, newString);
        }
    }
    public static void subsequence(String s,int i,String newstr,HashSet<String> set)
    {
        if(i==s.length()){
            if(set.contains(newstr)){
                return;

            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
             
        }

        char currchar=s.charAt(i);
        subsequence(s, i+1, newstr+currchar,set);
        subsequence(s, i+1, newstr,set);
    }
    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void printcombi(String st,int idx,String combination){
        if(idx==st.length()){
            System.out.println(combination);
            return;
        }
        char currch=st.charAt(idx);
        String mapping=keypad[currch-'0'];
        for(int i=0;i<mapping.length();i++){
            printcombi(st, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
       String st="99";
       printcombi(st, 0, "");
    }
}