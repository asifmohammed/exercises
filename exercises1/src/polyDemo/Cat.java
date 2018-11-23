package polyDemo;

public class Cat extends Animal {
    Cat(String name){
        this.name=name;
        this.age=age;
    }
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is "+name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
