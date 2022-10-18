public class Person {
    String firstName;
    String lastName;

    void display(){
        System.out.println(firstName + " " +lastName);
    }

}

class Emp extends Person{
double salary;

void display(){
    super.display();
    System.out.println("Salary is "+this.salary);
}

}

class Sts extends Person{
    int rollno;
    String schoolName;

    void display(){
        super.display();
        System.out.println("Roll no is "+this.rollno);
        System.out.println("School Name is "+this.schoolName);
    }
}