
abstract class Shape{
    abstract void numberOfSides();
}

class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("The number of sides is 4");
    }
}

class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("The number of sides is 6");
    }
}

class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("The number of sides is 3");
    }
}

public class Side{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}

