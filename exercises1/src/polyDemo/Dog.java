package polyDemo;

public class Dog extends Animal {
public Dog(String name,int age){
    super(name,age);
}
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is "+getName());
        System.out.println("I was born in the year "+calculateBirthYear());
    }
}
