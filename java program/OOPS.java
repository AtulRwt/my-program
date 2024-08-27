class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        int area=1/2*l*h;
        System.out.println(area);
    }
}
public class OOPS{
    public static void main(String args[]){
        Triangle t1=new Triangle();
        Shape s1=new Shape();
        s1.area();
        t1.area(1, 1);
    }
}