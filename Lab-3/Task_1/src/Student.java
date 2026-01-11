public class Student {
    private String id;
    private String name;
    private char gender;
    private String dateOfBirth;
    private String address;

    private static int counter=1;


    //Default Constructor
    Student(){
        this.id="SP25-BCS-000";
        this.gender='X';
    }

    //Parameterized Constructor
    Student(String name, char gender, String dateOfBirth, String address){
        this.setId();
        this.name=name;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
    }

    //Copy Constructor
    Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.gender=s.gender;
        this.dateOfBirth=s.dateOfBirth;
        this.address=s.address;
    }
    
    //Setters
    public void setId(){ 
        this.id=String.format("SP25-BCS-%03d", counter);
        counter++;
    }
    public void setName(String name){ this.name=name;}
    public void setGender(char gender){ 
        if(gender == 'M' || gender == 'F')
			this.gender = gender;
		else
			System.out.println("Error! Invalid gender.");
    }
    public void setDateOfBirth(String dateOfBirth){ this.dateOfBirth=dateOfBirth;}
    public void setAddress(String address){ this.address=address;}

    //Getters
    public String getId(){ return id; }
    public String getName(){ return name; }
    public char getGender(){ return gender; }
    public String getDateOfBirth(){ return dateOfBirth; }
    public String getAddress(){ return address; }

    @Override
    public String toString(){
        return "ID: "+this.getId()+" | Name: " + this.getName() + " | Gender: "+ this.getGender() + " | DOB: " + this.getDateOfBirth()+ " | Address: "+ this.getAddress();
        
    }

    @Override
    public boolean equals(Object o){
        Student s=(Student)o;
        return this.id.equals(s.id);
    }
}
