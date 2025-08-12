package FunctionalProgarming.ResultOfStudent;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // For easy printing
    public String toString() {
        return name + " - " + marks;
    }
}
