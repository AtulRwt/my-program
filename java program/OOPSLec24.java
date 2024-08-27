class Student{
    String name;
    static String school;

     
}
public class OOPSLec24
{
    public static void main(String args[]){
        Student.school="gkv";
        Student student1=new Student();
        student1.name="atul rawat";
        System.out.println(student1.school);
        
    }
    
}