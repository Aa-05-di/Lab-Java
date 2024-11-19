

class Employee{
    String name;
    double salary;
    int age;

    Employee(){
        this.name="unknown";
        this.age=0;
        this.salary=0.0;
    }

    Employee(String name,int age){
        this.name=name;
        this.age=age;
        this.salary=0.0;
    }

    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name is: "+name+"\tAge is: "+age+"\tSalary is: "+salary);
    }
}


public class Emp {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.display();
        Employee e1=new Employee("Sabari",20);
        e1.display();
        Employee e2=new Employee("Soman",25,16000);
        e2.display();
    }
}

