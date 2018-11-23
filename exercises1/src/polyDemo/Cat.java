package polyDemo;

public class Cat extends Animal {
public Cat(String name,int age){
    super(name,age);
}
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is "+getName());
        System.out.println("I was born in the year " + calculateBirthYear());
    }
}
