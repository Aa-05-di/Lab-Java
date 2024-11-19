import java.util.*;


class Vehicle{
    String make;
    String model;
    int year;
    String fuel;
    public Vehicle(String make,String model,int year,String fuel){
        this.make=make;
        this.year=year;
        this.model=model;
        this.fuel=fuel;
    }

    public void eff(){
        if(fuel=="Petrol"){
            System.out.println("The efficiency is 12-18km/l");
        }
        else if(fuel=="Dielsel"){
            System.out.println("The efficiency is 15-25km/l");
        }
        else{
            System.out.println("The efficiency is 12-18km/l");
        }
    }

    public void max(){
        if(fuel=="Petrol"){
            System.out.println("The max speed is 220km/hr");
        }
        else if(fuel=="Dielsel"){
            System.out.println("The max speed is 260km/hr");
        }
        else{
            System.out.println("The max speed is 200km/hr");
        }
    }

    public void Display(){
        System.out.println("Name: "+make+"\nModel: "+model+"\nYear: "+year+"\nFuel: "+fuel);
    }
}

class Truck extends Vehicle{
    String make;
    String model;
    int year;
    String fuel;
    public Truck(String make,String model,int year,String fuel){
        super(make,model,year,fuel);
    }


}

class Car extends Vehicle{
    String make;
    String model;
    int year;
    String fuel;
    public Car(String make,String model,int year,String fuel){
        super(make,model,year,fuel);
    }
}

class Motorcycle extends Vehicle{
    String make;
    String model;
    int year;
    String fuel;
    public Motorcycle(String make,String model,int year,String fuel){
        super(make,model,year,fuel);
    }
}

public class Make{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Truck t=new Truck("AL", "Toruz",2011, "Diesel");
        t.eff();
        t.max();
        t.Display();
        Car c=new Car("Mahindra", "Thar", 2022, "Diesel");
        c.eff();
        c.max();
        c.Display();
    }
}
