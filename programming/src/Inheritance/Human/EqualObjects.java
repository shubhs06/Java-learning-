package Inheritance.Human;

public class EqualObjects {

    public static void main(String[] args) {
        Person person1 = new Person("Shubham", "shu54", 22);
        Person person2 = new Person("Shubham", "shu54", 22);

         if (person1.equals(person2)){
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }


    }
    
}
