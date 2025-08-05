package CollectionsInJava;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Student {



    public final String name;
    public final char grade;

    
    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "name : " + name + ", grade : " + grade ;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    
    public static void main(String[] args) {
    
        Queue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Example: compare by grade (ascending)
                return s1.getGrade() - s2.getGrade();
            }
        });

        queue.offer(new Student("Shubham", 'A'));
        queue.offer(new Student("Om", 'B'));
        queue.offer(new Student("Sham", 'C'));
        queue.offer(new Student("Sam", 'D'));
        queue.offer(new Student("rajan", 'A'));
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    } 


}
