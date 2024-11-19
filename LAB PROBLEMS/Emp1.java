

class Employee{
    void display(){
        System.out.println("The name of class is employee");
    }

    void calcSalary(){
        System.out.println("Employee has salary of 12000");
    }
}

class Engineer extends Employee{
    void display(){
        System.out.println("The name of class is engineer");
    }

    void calcSalary(){
        System.out.println("Engineer has salary of 20000");
    }
}

public class Emp1{
    public static void main(String[] args) {
        Engineer e1=new Employee();
        e1.display();
        e1.calcSalary();
    }
}