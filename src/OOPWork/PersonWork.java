package OOPWork;
public class PersonWork {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Milan","Sharma",2500, "Computer");

        teacher.display();

        Student s = new Student("Harry", "KC",2,"Lily");
        s.display();
    }
}
class Person{
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void display(){
        System.out.println("Person first name is "+firstName);
        System.out.println("Person last name is "+lastName);
    }

}

class Teacher extends Person{
    double salary;
    String subject;

    Teacher(String firstName, String lastName, double salary, String subject ){
        super(firstName,lastName);
        this.salary = salary;
        this.subject = subject;
    }
    @Override
    void display(){
    System.out.println("Teacher first name is "+firstName);
    System.out.println("Teacher last name is "+lastName);
    System.out.println("Teacher subject is "+subject);
    System.out.println("Teacher salary is "+salary);
    System.out.println("------------------------");

}
}
class Student extends Person{
    int rollNo;
    String house;
    Student(String firstName, String lastName, int rollNo, String house){
        super(firstName, lastName);
        this.rollNo = rollNo;
        this.house = house;
    }
    @Override
    void display() {
        System.out.println("Student first name is " + firstName);
        System.out.println("Student last name is " + lastName);
        System.out.println("Roll number is "+rollNo);
        System.out.println("House is "+house);
    }
}
