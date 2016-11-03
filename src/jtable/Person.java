
package jtable;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
     public Person(int ID, String FirstName, String LastName, int Age)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }

    
    public static void main(String[] args) {
    }
    
}
