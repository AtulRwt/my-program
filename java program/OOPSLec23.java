

class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        int area=(l*h)/2;
        System.out.println(area);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println((h*l)/2);
    }
}
class circle extends Shape{
    public void area(int r){
        System.out.println((22*r*r)/7);
    }
}
public class OOPSLec23{
    public static void main(String args[]){
          
    }
}