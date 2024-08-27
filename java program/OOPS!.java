class pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }
}
public class OOPS{
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
    }
}