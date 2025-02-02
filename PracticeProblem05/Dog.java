package PracticeProblem05;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private boolean bark;
    private String state;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void display(){
        System.out.println("Info about dog");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Breed - "+breed);
        System.out.println("Barking? "+bark);
        System.out.println("Play: "+state);
    }
}
