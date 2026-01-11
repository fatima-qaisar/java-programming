public class Demo {

    public static void main(String[] args) {
        Employee e1=new Employee("Fatima", 37, 59800.85, "Model Town, Lahore");
        e1.display();
        Employee e2=new Employee();
        e2.setName("Ayesha");
        e2.setSocialSecurityNo(26);
        e2.setBaseSalary(65000.00);
        e2.setAddress("DHA , Karachi");
        e2.display();
        Employee e3=new Employee("Hassan", 87, 78700.50, "Johar Town, Lahore");
        e3.display();
    }
    
}
