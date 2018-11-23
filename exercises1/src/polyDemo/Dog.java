package polyDemo;

public class Dog extends Animal {
    Dog(String name){
        this.name=name;
        this.age=age;
    }
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is "+this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
