package task1;

public class Student {
    private String id;
    private String name;
    private boolean gender;
    private String dateOfBirth;
    private String address;

    Student(){}

    Student(String id, String name, String gender, String dateOfBirth, String address){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
    }

    Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.gender=s.gender;
        this.dateOfBirth=s.dateOfBirth;
        this.address=s.address;
    }

    public void setId(String id){ this.id=id;}
    public void setName(String name){ this.name=name;}
    public void setGender(boolean gender){ this.gender=gender;}
    public void setDateOfBirth(String dateOfBirth){ this.dateOfBirth=dateOfBirth;}
    public void setAddress(String address){ this.address=address;}

    public String getId(){ return id; }
    public String getName(){ return name; }
    public boolean getGender(){ return gender; }
    public String getDateOfBirth(){ return dateOfBirth; }
    public String getAddress(){ return address; }


    public String toString(){
        
    }


    
}
