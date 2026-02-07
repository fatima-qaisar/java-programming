public class DataTypes{

  public static void main (String a[]){
       System.out.println("Primitive data types in java:");

         long l=100;
         int i=10;
         short s=50;
         byte b=50;
         
         double d=10.0;
         float f=20.0f;
        
         char c='c';
  
         boolean b1=true; //false

//These 8 types are called primitive data types of java
// String is not included in primitive types. character ki array bna ke usme store krna parega string bnane ke liye

//3 different methods to print

System.out.println(" Print string amd cursor moves to new line");
System.out.print("Print and cursor remains on the same line");
System.out.printf("\nInformation %d",20 );             //%d-> integer, %f-> floating point, %b-> boolean, \n or %n is for new line, %.2f-> 2 decimal places
//System.out.err for errors
//System.out.err("Error log");
//Use printf for formatted output... e.g you want it to be shown as a table

System.out.printf("\nValue in int %d",i);
System.out.printf("\nValue in long %d",l);
System.out.printf("\nValue in short %d",s);
System.out.printf("\nValue in char %c",c);
System.out.printf("\nValue in int %d",i);
System.out.printf("\nValue in int %d",i);

}
}