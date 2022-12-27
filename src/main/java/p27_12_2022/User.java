package p27_12_2022;

public class User {
    public String firstName;
    public String lastName;
    public int yearOfBirth;

 //   public static void  stampajUsera(String firstName,String lastName, int age){
 //      System.out.println(firstName + " " +lastName + ", "+ age + "god");
 // }
 // no static
    public void stampajStarost(int currentYear){
        System.out.println(currentYear - this.yearOfBirth);
    }
    public int vratiStarost(int currentYear){
        int a = currentYear - this.yearOfBirth;
        return a;
    }
}
