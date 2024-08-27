public class LeetcodeQ10{
    public String convert(String s,int numRows){
        if(numRows==1){
            return s;
        }
        StringBuilder answer=new StringBuilder();
        int n=s.length();
        int diff=2*(numRows-1);
        int diagonaldiff=diff;
        int secondIndex=0;
        int index;
        for(int i=0;i<numRows;i++){
            index=i;
            while(index<n){
                answer.append(s.charAt(index)); 
                if(i!=0 && i!=numRows-1){
                    diagonaldiff=diff-2*i;
                    secondIndex=index+diagonaldiff;
                
                    if(secondIndex<n){
                        answer.append(s.charAt(secondIndex));
                    }
                }
                index+=diff;
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String str="PAYPALISHIRING";
        int numRows=3;
        LeetcodeQ10 solution=new LeetcodeQ10();
        System.out.println(solution.convert(str, numRows));
    }
}