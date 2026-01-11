package task1;

public class Student {
    private String name;
    private String email;
    private double CGPA; 

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }
    public void display(){
        System.out.println("---Student Details---");
        System.out.println("Name: "+ this.name);
        System.out.println("Email: "+ this.email);
        System.out.println("CGPA: "+ this.CGPA);
    }
}