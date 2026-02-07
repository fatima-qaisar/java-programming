public class Main {
    public static void main(String[] args){
        Student s1 =new Student();
        s1.setName("Fatima Qaisar");
        s1.setEmail("fatima79@gmail.com");
        s1.setCGPA(3.86);
        s1.display();
        Student s2=new Student("Ayesha Imran", "ayesha24@gamil.com",3.89);
        s2.display();
        Student s3= new Student("Hassan Ali", "hassan45@gmail.com", 3.65);
        System.out.println("---Student Details---");
        System.out.println("Name: "+ s3.getName());
        System.out.println("Email: "+ s3.getEmail());
        System.out.println("CGPA: "+ s3.getCGPA());
    }
}
