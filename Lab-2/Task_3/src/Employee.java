package task3;

public class Employee {
    private String name;
	private int socialSecurityNo ;
	private double baseSalary;
	private String address;

    Employee(String name, int socialSecurityNo, double baseSalary, String address){
        this.name=name;
        this.socialSecurityNo=socialSecurityNo;
        this.baseSalary=baseSalary;
        this.address=address;
    }

    Employee(){}

    public void setName(String name){this.name=name;}
    public void setSocialSecurityNo(int socialSecurityNo){
        if (socialSecurityNo>0)
        this.socialSecurityNo=socialSecurityNo;
    }
    public void setBaseSalary(double baseSalary){
        if(baseSalary>=0)
        this.baseSalary=baseSalary;
    }
    public void setAddress(String address){this.address=address;}

    public String getName(){
        return name;
    }
    public int getSocialSecurityNo(){
        return socialSecurityNo;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getAddress(){
        return address;
    }

    public void display(){
        System.out.println("--- Employee Details ---");
        System.out.println("Name: "+ this.getName());
        System.out.println("SSN: "+ this.getSocialSecurityNo());
        System.out.println("BaseSalary: "+ this.getBaseSalary());
        System.out.println("Address: "+ this.getAddress());
    }
    
}
