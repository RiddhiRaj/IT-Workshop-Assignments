class Student{
    int rollno;
    String name;
    static String college = "ITS";

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}
}

class P1{
    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");

        s1.display();
    }
}

// Output:
// 111 Karan ITS