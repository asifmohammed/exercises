package polyDemo;

public class Dog extends Animal {
    Dog(String name){
        this.name=name;
    }
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is "+name);
    }
}
