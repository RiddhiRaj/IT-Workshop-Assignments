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