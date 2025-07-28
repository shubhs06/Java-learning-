public class Student {
    
    String stdName;
    int age ;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student Name : " + stdName + "Student Age : "+ age;
    }
    Student(String stdName, int age){
        this.stdName = stdName ;
        this.age = age;

    }
    public static void main(String[] args) {
        Student stu = new Student("Shubham", 22);
        System.out.println(stu);
    }
    
}
