public class Course {
    
    static int maxCapacity = 100;
    String courseName ;
    int enrolledment ;

    String[] enrolledStudents ;

    Course(String courseName){
        this.courseName =courseName;
        this.enrolledment =0;
        this.enrolledStudents = new String[maxCapacity];

    }
    

    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = capacity;
        
    }
    void enrolledStudent(String studentName){
        enrolledStudents[enrolledment]= studentName;
        System.out.println(studentName +"  your enrollement is successful");
        enrolledment++;

    }
    void unEnrolledStudent(String studentName){
        int i = 0;
        while (i < enrolledStudents.length -1) {
            if (enrolledStudents[i] == studentName) {
                enrolledStudents[i] = enrolledStudents[enrolledment - i];
                System.out.println("you are removed from course now, " + studentName); 
                enrolledment--;
            }
            i++;
        }
        
    }
    void showEnrolledStudent(){
        System.err.println("Enrolled Students Are : " + this.enrolledment);
    }
    public static void main(String[] args) {
        Course myCourse = new Course("JavaLerarning");
        myCourse.enrolledStudent("shubham");
        myCourse.enrolledStudent("Anand");
        myCourse.enrolledStudent("Jo");
        myCourse.unEnrolledStudent("Anand");
        myCourse.showEnrolledStudent();
    }
}
