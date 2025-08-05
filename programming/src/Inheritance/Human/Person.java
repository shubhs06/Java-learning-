package Inheritance.Human;

import java.util.Objects;

public class Person {

    private String name;
    private String id;
    private int age;


    Person(String name, String id ,int age){
        this.name =name;
        this.id = id;
        this.age =age;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + age;
        return result;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
    }

    
    

}
