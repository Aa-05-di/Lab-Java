
import java.util.*;

class Employee{
    String name;
    int age;
    long phone;
    String address;
    double salary;

    Employee(String name,int age,long phone,String address,double salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.address=address;

    }

    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nPhone: "+phone+"\nSalary: "+salary+"\nAddress: "+address);
    }

}

class Officer extends Employee{
    Officer(String name,int age,long phone,String address,double salary){
        super(name,age,phone,address,salary);
    }
    void fact(String sp){
    System.out.println("Specialization is: "+sp);
    }

}

class Manager extends Employee{
    Manager(String name,int age,long phone,String address,double salary){
        super(name,age,phone,address,salary);
    }
    void fact1(String dep){
        System.out.println("Department is: "+dep);
        }

}
public class Office{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of officer:");
        String n1=s.nextLine();
        System.out.println("Enter age of officer:");
        int n2=s.nextInt();
        s.nextLine();
        System.out.println("Enter the address of officer:");
        String n3=s.nextLine();
        System.out.println("Enter the phone number of officer:");
        long n4=s.nextLong();
        System.out.println("Enter the salary of officer:");
        double n5=s.nextDouble();
        s.nextLine();
        System.out.println("Enter specialization:");
        String n6=s.nextLine();
        Officer o=new Officer(n1, n2, n4, n3, n5);
        o.display();
        o.fact(n6);

        System.out.println("Enter name of manager:");
        String m1=s.nextLine();
        System.out.println("Enter age of manager:");
        int m2=s.nextInt();
        s.nextLine();
        System.out.println("Enter the address of manager:");
        String m3=s.nextLine();
        System.out.println("Enter the phone number of manager:");
        long m4=s.nextLong();
        System.out.println("Enter the salary of manager:");
        double m5=s.nextDouble();
        s.nextLine();
        System.out.println("Enter Department:");
        String m6=s.nextLine();
        Manager m=new Manager(m1,m2,m4,m3,m5);
        m.display();
        m.fact1(n6);

    }
}

