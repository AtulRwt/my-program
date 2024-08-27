public class StringsBuilderLec13{
    public static  void main(String args[]){
        StringBuilder a=new StringBuilder("atul");
         
        for(int i=0;i<a.length()/2;i++)
        {
            int front=i;
            int back=a.length()-1-i;
            char frontchar=a.charAt(front);
            char backchar=a.charAt(back);
            a.setCharAt(front,backchar);
            a.setCharAt(back,frontchar);
        }
        System.out.println(a);

    }
}