//implement multilevel inheritance in java

class Shape{
    public void display(){
        System.out.println("Inside display");
    }
}

class Rectangle extends Shape{
    public void area(){
        System.out.println("Inside area");
    }
}

class Cube extends Rectangle{
    public void volume(){
        System.out.println("Inside volume");
    }
}

class P5{
    public static void main(String args[]){
        Cube c = new Cube();
        c.display();
        c.area();
        c.volume();
    }
}

// Output:
// Inside display
// Inside area
// Inside volume
