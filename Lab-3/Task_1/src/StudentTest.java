public class StudentTest {
    public static void main(String[] args){
        Student s1=new Student("Fatima Qaisar", 'F', "23-09-2010", "Model Town, Lahore");
        Student s2=new Student("Ali Hassan", 'M', "16-03-2009", "DHA, Karachi");
        Student s3=new Student(s1);
        Student s4=new Student();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("Comparing IDs of student 1 and student 3...");
        if(s1.equals(s3)){
            System.out.println("IDs are equal.");
        }else{
            System.out.println("IDs are not equal.");
        }
        
    }
    
}
