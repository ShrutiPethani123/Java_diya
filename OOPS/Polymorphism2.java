class College{

    College()
    {
        System.out.println("Parent class constructor");
    }

    void data()
    {
        System.out.println("All details of college");
    }

    void department()
    {
        System.out.println("Department");
    }
}
class Student extends College{

    Student()
    {
        System.out.println("Child class constructor");
    }

    void data()
    {
        System.out.println("Student data");
    }

    void study()
    {
        System.out.println("Study");
    }

}

public class Polymorphism2 {
    public static void main(String[] args) {
        
        // Student s = new Student();
        // s.data();

        // College c = new College();
        // c.data();

        // parent ref & parent obj
        
        College o1 = new College();
        o1.data();
        o1.department();
        // o1.study();

        // child ref & child obj
        System.out.println();
        Student o2 = new Student();
        o2.data();
        o2.department();
        o2.study();

        // child ref & parent obj

        // Student o3 = new College();-->  invalid



        // parent ref & child obj

        System.out.println();
        College o4 = new Student();
        o4.data();
        o4.department();
        // o4.study();
        
        



    }
}
