package polyDemo;

public class Cat extends Animal {
    Cat(String name){
        this.name=name;
    }
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is "+name);
    }
}
