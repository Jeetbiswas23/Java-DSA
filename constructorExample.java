package OOPs;

public class constructorExample {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Jeet";
        s1.Rollno = 123;
        s1.pass = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 = new Student(s1);
        s2.pass = "xyz";
        s2.marks[2] = 40;// Technically the 2 should'nt be changed but it changed the value(This has it's Problem)
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        
    }
    
}

class Student {
    String name;
    int Rollno;
    String pass;
    int marks[];

    Student(Student s1) {
        marks= new int[3];
        this.name = s1.name;
        this.Rollno = s1.Rollno;
        this.marks = s1.marks;
        
    }

    Student() {              //this Student() is a Constructor and if do'nt write any constructor 
        marks= new int[3];                    //so it make it's default comnstructor     
    }
}
