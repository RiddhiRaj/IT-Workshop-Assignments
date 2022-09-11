//heirarchial inheritance in java
class A{
    public void methodA(){
        System.out.println("Method A");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Method B");
    }
}
class C extends A{
    public void methodC(){
        System.out.println("Method C");
    }
}
class P4{
    public static void main(String args[]){
        B b = new B();
        C c = new C();
        b.methodA();
        c.methodA();
    }
}

// Output:
// Method A
// Method A